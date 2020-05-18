package com.benny.traveladvisor.annotation;

import java.lang.annotation.*;

/**
 * This is the annotation for deciding whether need to check the signature of a request or not
 *
 * @author benny.li
 * @data 2020/5/14
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckSign {
}
