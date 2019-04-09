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

eureka--->: