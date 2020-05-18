package com.benny.traveladvisor.service.impl;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.dto.ParamResponse;
import com.benny.traveladvisor.service.CacheService;
import com.benny.traveladvisor.service.ResourceService;
import com.benny.traveladvisor.service.SessionService;
import com.benny.traveladvisor.timatic3.dto.*;
import com.benny.traveladvisor.timatic3.service.Timatic3Client;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Resources service
 * @author benny.li
 * Date: 2020/5/18
 */
@Service
@Slf4j
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private CacheService cacheService;
    @Autowired
    private Timatic3Client timatic3Client;
    @Autowired
    private SessionService sessionService;

    /**
     * Description: Retrieve parameters from cache by given criteria
     * @author benny.li
     * Date: 2020/5/18
     * @param parameterType: Timatic parameter type
     * @param cacheEnums: cacheEnums configuration
     * @return com.benny.traveladvisor.dto.ParamResponse
     */
    @Override
    public ParamResponse getParam(ParameterType parameterType, CacheEnums cacheEnums) {
        String key = cacheEnums.getKey();
        if(cacheService.hasKey(key)) {
            return (ParamResponse) cacheService.get(key);
        } else {
            return setParam(parameterType, cacheEnums);
        }
    }

    /**
     * Description: Set parameters into cache
     * @author benny.li
     * Date: 2020/5/18
     * @param parameterType: Timatic parameter type
     * @param cacheEnums: cacheEnums configuration
     * @return com.benny.traveladvisor.dto.ParamResponse
     */
    @Override
    public ParamResponse setParam(ParameterType parameterType, CacheEnums cacheEnums) {
        String cachedSessionID = sessionService.getSession();
        if(!Strings.isNullOrEmpty(cachedSessionID)) {
            ParamValuesRequest paramValuesRequest = new ParamValuesRequest();
            paramValuesRequest.setParameterName(parameterType);

            ParamValuesResponse paramValuesResponse = timatic3Client.submitParamValuesRequest(paramValuesRequest, cachedSessionID);

            if(null == paramValuesResponse.getError()) {
                List<ParamResponse.Param> params = new ArrayList<>();
                ParamResponse paramResponse = new ParamResponse();
                List<Value> values = paramValuesResponse.getValues().getValue();
                for (Value value : values) {
                    ParamResponse.Param param = new ParamResponse.Param();

                    switch (parameterType) {
                        case COUNTRY:
                            param.setCode(value.getCode());
                            param.setName(value.getName());
                            break;
                        case DOCUMENT_TYPE:
                        case DOCUMENT_GROUP:
                            param.setCode(value.getName());
                            param.setName(value.getDisplayName());
                            break;
                    }

                    params.add(param);
                }
                paramResponse.setParams(params);
                cacheService.set(cacheEnums.getKey(), paramResponse, cacheEnums);
                return paramResponse;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Description: Delete parameters cache
     * @author benny.li
     * Date: 2020/5/18
     * @param cacheEnums: cacheEnums configuration
     * @return boolean
     */
    @Override
    public boolean delParam(CacheEnums cacheEnums) {
        return cacheService.remove(cacheEnums.getKey());
    }

    /**
     * Description: A topper layer of retrieving Country parameters
     * @author benny.li
     * Date: 2020/5/18
     * @return com.benny.traveladvisor.dto.ParamResponse
     */
    @Override
    public ParamResponse getCountry() {
        return this.getParam(ParameterType.COUNTRY, CacheEnums.COUNTRY);
    }

    /**
     * Description: A topper layer of deleting the Country parameters cache
     * @author benny.li
     * Date: 2020/5/18
     * @return boolean
     */
    @Override
    public boolean delCountry() {
        return this.delParam(CacheEnums.COUNTRY);
    }

    /**
     * Description: A topper layer of retrieving Document Type parameters
     * @author benny.li
     * Date: 2020/5/18
     * @return com.benny.traveladvisor.dto.ParamResponse
     */
    @Override
    public ParamResponse getDocType() {
        return this.getParam(ParameterType.DOCUMENT_TYPE, CacheEnums.DOC_TYPE);
    }

    /**
     * Description: A topper layer of deleting the Document Type parameters cache
     * @author benny.li
     * Date: 2020/5/18
     * @return boolean
     */
    @Override
    public boolean delDocType() {
        return this.delParam(CacheEnums.DOC_TYPE);
    }

    /**
     * Description: A topper layer of retrieving Document Group parameters
     * @author benny.li
     * Date: 2020/5/18
     * @return com.benny.traveladvisor.dto.ParamResponse
     */
    @Override
    public ParamResponse getDocGroup() {
        return this.getParam(ParameterType.DOCUMENT_GROUP, CacheEnums.DOC_GROUP);
    }

    /**
     * Description: A topper layer of deleting the Document Group parameters cache
     * @author benny.li
     * Date: 2020/5/18
     * @return boolean
     */
    @Override
    public boolean delDocGroup() {
        return this.delParam(CacheEnums.DOC_GROUP);
    }
}
