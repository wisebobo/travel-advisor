package com.benny.traveladvisor.service.impl;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.service.CacheService;
import com.benny.traveladvisor.service.SessionService;
import com.benny.traveladvisor.timatic3.dto.CheckNameResponse;
import com.benny.traveladvisor.timatic3.dto.ProcessLoginResponse;
import com.benny.traveladvisor.timatic3.service.Timatic3Client;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * Description: Session Service
 * @author benny.li
 * Date: 2020/5/18
 */
@Service
@Slf4j
public class SessionServiceImpl implements SessionService {
    @Autowired
    private CacheService cacheService;

    @Autowired
    private Timatic3Client timatic3Client;

    /**
     * Description: Set session into cache
     * @author benny.li
     * Date: 2020/5/18
     * @return java.lang.String
     */
    @Override
    public String setSession() {
        ProcessLoginResponse response = timatic3Client.checkName();
        CheckNameResponse checkNameResponse = response.getCheckNameResponse();
        BigInteger randomNumber = checkNameResponse.getRandomNumber();
        String sessionID = checkNameResponse.getSessionID();

        if (randomNumber.compareTo(new BigInteger("0")) != 0 && !Strings.isNullOrEmpty(sessionID)) {
            ProcessLoginResponse response1 = timatic3Client.loginRequest(randomNumber.toString(), sessionID);

            if (response1 != null && response1.getLoginResponse().isSuccessfulLogin()) {
                cacheService.set(CacheEnums.SESSION_ID.getKey(), sessionID, CacheEnums.SESSION_ID);
                return sessionID;
            } else {
                log.error(response1.getLoginResponse().getError().getMessage());
                return "";
            }
        } else {
            log.error("Failed to call checkName! RandomNumber = " + randomNumber + "; sessionID = " + sessionID);
            return "";
        }

    }

    /**
     * Description: Get session from cache
     * @author benny.li
     * Date: 2020/5/18
     * @return java.lang.String
     */
    @Override
    public String getSession() {
        String key = CacheEnums.SESSION_ID.getKey();
        if(cacheService.hasKey(key)) {
            return (String) cacheService.get(key);
        } else {
            return setSession();
        }
    }

    /**
     * Description: Delete session from cache
     * @author benny.li
     * Date: 2020/5/18
     */
    @Override
    public void delSession() {
        cacheService.remove(CacheEnums.SESSION_ID.getKey());
    }
}
