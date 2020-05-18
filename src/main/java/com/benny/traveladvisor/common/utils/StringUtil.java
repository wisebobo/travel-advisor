package com.benny.traveladvisor.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Description: A string utility class
 * @author benny.li
 * Date: 2020/5/18
 */
@Slf4j
public class StringUtil {

    /**
     * Description: Convert List string to String, by adding separator in between
     * @author benny.li
     * Date: 2020/5/18
     * @param lists: List string
     * @param separator: The separator to separate the list
     * @return java.lang.String
     */
    public static String convertListToStr(List<String> lists, String separator) {
        if (lists != null && !lists.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String list : lists) {
                log.debug(list);
                stringBuilder.append(list).append(separator);
            }
            return stringBuilder.toString();
        } else {
            return "";
        }
    }
}
