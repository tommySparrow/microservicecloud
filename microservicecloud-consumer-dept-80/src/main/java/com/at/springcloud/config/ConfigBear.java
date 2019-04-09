package com.at.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2019/4/9
 * @ Description： 配置类
 * @ throws
 */
@Configuration
public class ConfigBear {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
