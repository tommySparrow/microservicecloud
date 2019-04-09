package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 服务消费者
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DeptConsumer80_App {

    public static void main( String[] args ) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
