package com.benny.traveladvisor.filter;

import com.benny.traveladvisor.common.utils.MultiReadHttpServletRequest;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Description: Defining a Filter to cache the HttpServletRequest, due to getInputStream can only be read once
 * @author benny.li
 * Date: 2020/5/18
 */
@Order(1)
@WebFilter(filterName = "WebMvcFilter", urlPatterns = {"/travelAdvisor", "/travelAdvisor/*", "/resources/*"})
//urlPatterns 不能设置为 "/*", 否则无法登录 Druid Monitor (有待Druid官方修复session问题)
public class WebMvcFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 防止流读取一次后就没有了, 所以需要将流继续写出去
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        // 这里将原始request传入，读出流并存储
        ServletRequest cachedRequest = new MultiReadHttpServletRequest(httpServletRequest);
        // 这里将原始request替换为包装后的request，此后所有进入controller的request均为包装后的
        filterChain.doFilter(cachedRequest, servletResponse);
    }

}
