微服务架构studying...:

microservicecloud-api--->:公用模块

microservicecloud-provider-dept-8001--->:dept服务提供者

1.集成通用mapper:
    com.at.springcloud.utils.MapperUtil --创建通用接口
     引入依赖:<!-- 整合通用mapper -->
                <dependency>
                    <groupId>tk.mybatis</groupId>
                    <artifactId>mapper-spring-boot-starter</artifactId>
                    <version>2.0.2</version>
                </dependency>
2.使用selectByPrimaryKey 需要在实体类主键id上添加注解@id,标识id

microservicecloud-consumer-dept-80---->:dept服务消费者
1.解决报错:Cannot determine embedded database driver class for database type NONE
    解决方案:@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
    
2.在 RestTemplate bean上添加@LoadBalanced---(ResTempltateCustomizer 决定访问的地址调用哪个服务)

microservicecloud-eureka-7001--->:eureka 提供服务
    访问 status的地址显示/info信息步骤;
        1.在父工程添加
           <build>
                   <finalName>microservicecloud</finalName>
                   <resources>
                       <resource>
                           <directory>src/main/resources</directory>
                           <filtering>true</filtering>
                       </resource>
                   </resources>
                   <plugins>
                       <plugin>
                           <groupId>org.apache.maven.plugins</groupId>
                           <artifactId>maven-resources-plugin</artifactId>
                           <configuration>
                               <delimiters>
                                   <delimit>$</delimit>
                               </delimiters>
                           </configuration>
                       </plugin>
                   </plugins>
               </build>
        2.在provider(客户端)做以下操作:
            1.添加依赖
                <!-- actuator监控信息完善(显示eureka /info信息) -->
                       <dependency>
                           <groupId>org.springframework.boot</groupId>
                           <artifactId>spring-boot-starter-actuator</artifactId>
                       </dependency>
                       
                2.application.yml 文件添加:
                    info:
                      app.name: microservicecloud
                      company.name: www.baidu.com
                      build.artifactId: $project.artifactId$
                      build.version: $project.version$
                      
                      
eureka集群配置:
microservicecloud-eureka-7001
microservicecloud-eureka-7002
microservicecloud-eureka-7003

1.新建三个项目
2.修改application.yml文件---注册地址
3.映射IP: 在C:\Windows\System32\drivers\etc 目录下修改hosts文件(单机使用)
      127.0.0.1		  eureka7001.com
      127.0.0.1		  eureka7002.com
      127.0.0.1		  eureka7003.com
      
      
      
ribbon: 



hystrix: 熔断器 ---->:熔断器熔断方法参数类型要和原方法保持一致

HystrixDashboard:
    访问地址:http://localhost:9001/hystrix
    
hosts配置:
  127.0.0.1		  eureka7001.com
  127.0.0.1		  eureka7002.com
  127.0.0.1		  eureka7003.com
  127.0.0.1     gateway-9527.com