package com.at.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 服务提供者
 * @ EnableEurekaClient  客户端
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.at.springcloud.mapper")
public class DeptProvider8001_App {

    public static void main( String[] args ){
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
