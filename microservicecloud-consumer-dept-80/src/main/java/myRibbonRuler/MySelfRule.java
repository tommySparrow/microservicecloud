package myRibbonRuler;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2019/4/13
 * @ Description：自定义ribbon策略
 * @ throws
 * @author User
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule_JY();// 我自定义为每台机器5次
    }
}
