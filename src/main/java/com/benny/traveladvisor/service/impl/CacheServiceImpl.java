package com.benny.traveladvisor.service.impl;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

/**
 * Description: Redis cache related service
 * @author benny.li
 * Date: 2020/5/18
 */
@Service
@Slf4j
public class CacheServiceImpl implements CacheService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * Description: Retrieve the value by given key
     * @author benny.li
     * Date: 2020/5/18
     * @param key: Redis key
     * @return java.lang.Object
     */
    @Override
    public Object get(String key) {
        try {
            return key==null?null:redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * Description: Check if key exists in Redis
     * @author benny.li
     * Date: 2020/5/18
     * @param key: Redis key
     * @return boolean
     */
    @Override
    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    /**
     * Description: Set key:value into Redis
     * @author benny.li
     * Date: 2020/5/18
     * @param key: key
     * @param value: value
     * @param config: The cacheEnums defining the expiry time
     * @return boolean
     */
    @Override
    public boolean set(String key, Object value, CacheEnums config) {
        try {
            if (config.getExpire() != 0) {
                //有失效时间
                redisTemplate.opsForValue().set(key, value, config.getExpire(), config.getTimeUnit());
            } else {
                //无失效时间
                redisTemplate.opsForValue().set(key, value);
            }
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    /**
     * Description: Delete Redis cache by given keys
     * @author benny.li
     * Date: 2020/5/18
     * @param keys: keys
     * @return boolean
     */
    @Override
    public boolean remove(Collection keys) {
        try {
            redisTemplate.delete(keys);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    /**
     * Description: Delete Redis cache by given key
     * @author benny.li
     * Date: 2020/5/18
     * @param key: key
     * @return boolean
     */
    @Override
    public boolean remove(String key) {
        try {
            redisTemplate.delete(key);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    /**
     * Description: Retrieve keys by given key pattern
     * @author benny.li
     * Date: 2020/5/18
     * @param pattern: key pattern (e.g. TravalAdvisor:*)
     * @return java.util.Set<java.lang.String>
     */
    @Override
    public Set<String> keys(String pattern) {
        try {
            return redisTemplate.keys(pattern);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * Description: Delete keys by given key pattern
     * @author benny.li
     * Date: 2020/5/18
     * @param keyPattern: key pattern
     * @return boolean
     */
    @Override
    public boolean flushDB(String keyPattern) {
        return this.remove(this.keys(keyPattern));
    }
}
