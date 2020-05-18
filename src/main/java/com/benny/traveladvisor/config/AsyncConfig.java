package com.benny.traveladvisor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Description: This is an Async configuration class
 * @author benny.li
 * Date: 2020/5/18
 */
@Configuration
@EnableAsync
public class AsyncConfig {

    /**
     * Description: 声明一个线程池(并指定线程池的名字)
     * @author benny.li
     * Date: 2020/5/18
     * @return java.util.concurrent.Executor
     */
    @Bean("cacheExecutor")
    public Executor cacheExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心线程数5：线程池创建时候初始化的线程数
        executor.setCorePoolSize(50);
        //最大线程数5：线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
        executor.setMaxPoolSize(100);
        //缓冲队列500：用来缓冲执行任务的队列
        executor.setQueueCapacity(1000);
        //允许线程的空闲时间60秒：当超过了核心线程出之外的线程在空闲时间到达之后会被销毁
        executor.setKeepAliveSeconds(60);
        //线程池名的前缀：设置好了之后可以方便我们定位处理任务所在的线程池
        executor.setThreadNamePrefix("cacheExecutor-");
//        executor.initialize();
        return executor;
    }
}
