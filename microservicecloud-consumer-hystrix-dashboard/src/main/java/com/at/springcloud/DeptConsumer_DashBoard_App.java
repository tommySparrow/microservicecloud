package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2019/4/16
 * @ Description：豪猪
 * @ throws
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }
}
