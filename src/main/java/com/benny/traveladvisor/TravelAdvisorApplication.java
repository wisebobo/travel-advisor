package com.benny.traveladvisor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ServletComponentScan
@MapperScan("com.benny.traveladvisor.dao")
public class TravelAdvisorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAdvisorApplication.class, args);
    }

}
