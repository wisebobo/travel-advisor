package com.benny.traveladvisor.service;

import com.benny.traveladvisor.common.enums.CacheEnums;
import com.benny.traveladvisor.dto.ParamResponse;
import com.benny.traveladvisor.timatic3.dto.ParameterType;

/**
 * Description: Interface class for Resource service
 * @author benny.li
 * Date: 2020/5/18
 */
public interface ResourceService {
    ParamResponse setParam(ParameterType parameterType, CacheEnums cacheEnums);
    ParamResponse getParam(ParameterType parameterType, CacheEnums cacheEnums);
    boolean delParam(CacheEnums cacheEnums);

    ParamResponse getCountry();
    boolean delCountry();

    ParamResponse getDocType();
    boolean delDocType();

    ParamResponse getDocGroup();
    boolean delDocGroup();
}
