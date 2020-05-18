package com.benny.traveladvisor.common.utils;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.dto.DocRequest;
import com.benny.traveladvisor.dto.DocResponse;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Strings;
import org.springframework.util.Assert;

/**
 * Description: Redis Key Utility
 * @author benny.li
 * Date: 2020/5/18
 */
public class RedisKeyUtil {
    /**
     * Description: Generate Redis Key with Prefix
     * @author benny.li
     * Date: 2020/5/12
     * @param cacheConfig: Cache config from CacheEnums
     * @param key: Key
     * @return java.lang.String
     */
    public static String genRedisKey(CacheEnums cacheConfig, String key) {
        if(!Strings.isNullOrEmpty(key)) {
            return new StringBuffer(cacheConfig.getKey()).append(Const.SYMBOL_COLON).append(key).toString();
        }
        return cacheConfig.getKey();
    }

    /**
     * Description: Generate Document Keys. Sample Format: Doc:Key:CN:JP:passport:N
     * @author benny.li
     * Date: 2020/5/12
     * @param docRequest: DocRequest
     * @return java.lang.String
     */
    public static String docKey(DocRequest docRequest) {
        Assert.notNull(docRequest.getFromCountryCode(), "FromCountryCode cannot be null");
        Assert.notNull(docRequest.getToCountryCode(), "ToCountryCode cannot be null");
        Assert.notNull(docRequest.getDocType(), "DocType cannot be null");
        Assert.notNull(docRequest.getDocGroup(), "DocGroup cannot be null");

        String key = new StringBuffer().append(docRequest.getFromCountryCode())
                .append(Const.SYMBOL_COLON)
                .append(docRequest.getToCountryCode())
                .append(Const.SYMBOL_COLON)
                .append(docRequest.getDocType())
                .append(Const.SYMBOL_COLON)
                .append(docRequest.getDocGroup())
                .toString();

        return genRedisKey(CacheEnums.DOC_KEY, key);
    }
}
