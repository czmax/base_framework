package com.demo.base.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @author Chen
 * @created 2019-01-20-11:26.
 * https://blog.csdn.net/hao7030187/article/details/79077464
 */

@Configuration
@EnableScheduling
public class SchedulerConfig {
    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        //线程池大小
        scheduler.setPoolSize(10);
        //线程名字前缀
        scheduler.setThreadNamePrefix("spring-task-thread");
        return scheduler;
    }

}
