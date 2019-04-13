package com.at.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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

    /**
     * ResTempltateCustomizer会给会将标有@LoadBalance的RestTemplate添加一个拦截器，
     * 拦截器的作用就是对请求的URI进行转换获取到具体应该请求哪个服务实例ServiceInstance(决定调用哪个服务)
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new RandomRule();//随机算法替代默认的轮询。
    }
}
