package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 服务提供者
 * @ EnableEurekaClient  客户端
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@MapperScan(value = "com.at.springcloud.mapper")
public class DeptProvider8001_Hystrix_App {

    public static void main( String[] args ){
        SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
    }
}
