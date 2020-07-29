package com.lijie.bs_healthy.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * /**
 * Configuration:表示该类是一个配置类。spring boot建议我们使用该注解来代替传统的xml配置文件；
 @Configuration包含了@Component。所以加了@Configuration注解的类会自动纳入spring容器
 相当于xml中的<beans></beans>

 @Bean:让Spring容器管理创建的对象,默认对象名就是方法名
 */
@Configuration
public class DemoConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

//    @Bean
//    public UserInfo user(){
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername(username);
//        return userInfo;
//    }
}
