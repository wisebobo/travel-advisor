package com.benny.traveladvisor.common.enums;

import java.util.concurrent.TimeUnit;

/**
 * This is the enum class for cache setting
 *
 * @author benny.li
 * @data 2020/5/11
 */
public enum CacheEnums {
    COMMON_SETTING("Common:Setting", 2,TimeUnit.HOURS),
    SESSION_ID("Common:SessionId", 30, TimeUnit.MINUTES),
    DOC_KEY("TravelAdvisor", 1, TimeUnit.DAYS),
    COUNTRY("Country", 30, TimeUnit.DAYS),
    DOC_TYPE("DocType", 30, TimeUnit.DAYS),
    DOC_GROUP("DocGroup", 30, TimeUnit.DAYS);

    private final String key;
    private final Integer expire;
    private final TimeUnit timeUnit;

    CacheEnums(String key, Integer expire, TimeUnit timeUnit) {
        this.key = key;
        this.expire = expire;
        this.timeUnit = timeUnit;
    }

    public String getKey() {
        return key;
    }

    public Integer getExpire() {
        return expire;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }
}
