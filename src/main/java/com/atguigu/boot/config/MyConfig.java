package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.Bean.Car;
import com.atguigu.boot.Bean.User;
import com.atguigu.boot.Bean.Pet;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * ClassName: MyConfig
 * Package: com.atguigu.boot.config
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/23 - 18:08
 * @Version: v1.0
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User user1(){
        return new User("Black",11);
    }

    @Bean
    public Pet cat(){
        return new Pet("tomcat",2.99);
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }
        };
    }
}
