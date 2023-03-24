package com.atguigu.boot;

import ch.qos.logback.core.db.DBHelper;
import ch.qos.logback.core.spi.ScanException;
import com.atguigu.boot.Bean.User;
import com.atguigu.boot.Bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ClassName: MainApplication
 * Package: com.atguigu.boot
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/22 - 15:58
 * @Version: v1.0
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MainApplication.class,args);
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);

        //查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }

        Pet tom1 = run.getBean("cat", Pet.class);
        Pet tom2 = run.getBean("cat", Pet.class);
        System.out.println(tom1 == tom2);

        String[] beanNameForType = run.getBeanNamesForType(User.class);
        System.out.println("========");
        for (String s : beanNameForType){
            System.out.println(s);
        }
        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);
    }
}
