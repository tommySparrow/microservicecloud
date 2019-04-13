package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * feign
 * @author jerry
 */
//scanBasePackages = {"com.at.springcloud"} 作用于feign扫描
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},scanBasePackages = {"com.at.springcloud"})
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.at.springcloud"})//作用于feign扫描
public class DeptConsumer80_Feign_App {

    public static void main( String[] args ) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
