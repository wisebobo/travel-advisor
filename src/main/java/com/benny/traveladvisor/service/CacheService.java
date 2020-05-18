package com.benny.traveladvisor.service;

import com.benny.traveladvisor.common.enums.CacheEnums;

import java.util.Collection;
import java.util.Set;

/**
 * Description: Interface class of Cache service
 * @author benny.li
 * Date: 2020/5/18
 */
public interface CacheService {
    Object get(String key);

    boolean hasKey(String key);

    boolean set(String key, Object value, CacheEnums config);

    boolean remove(Collection keys);

    boolean remove(String key);

    boolean flushDB(String keyPattern);

    Set<String> keys(String pattern);
}
