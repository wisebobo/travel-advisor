package com.benny.traveladvisor.config;

import com.benny.traveladvisor.interceptor.SignVerifyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: This is a Web MVC Interceptor configuration class
 * @author benny.li
 * Date: 2020/5/18
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private SignVerifyInterceptor signVerifyInterceptor;

    /**
     * Description: Override the addInterceptors method to add the signature verify interceptor
     * @author benny.li
     * Date: 2020/5/18
     * @param registry:
     * @return void
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器并配置拦截的路径
        registry.addInterceptor(signVerifyInterceptor).addPathPatterns("/**");
    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        //设置允许跨域的路径
//        registry.addMapping("/**")
//                //设置允许跨域请求的域名
//                .allowedOrigins("*")
//                //是否允许证书 不再默认开启
//                .allowCredentials(true)
//                //设置允许的方法
//                .allowedMethods("*")
//                //设置允许的Header
//                .allowedHeaders("*")
//                //跨域允许时间
//                .maxAge(3600);
//    }
}
