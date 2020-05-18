package com.benny.traveladvisor.common.utils;

import org.springframework.stereotype.Component;

/**
 * Description: This is a const class for defining static variables
 * @author benny.li
 * Date: 2020/5/18
 */
@Component
public class Const {
    public static final String SYMBOL_COLON = ":";

    /**
     * 日志打印内容key name
     */
    public static final String LOGGER_REQUEST_ID = "system.requestID";
    public static final String LOGGER_REQUEST_URI = "system.requestUri";
    public static final String LOGGER_MAIN_THREAD = "system.mainThread";

}
