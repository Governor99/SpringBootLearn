package com.atguigu.boot.controller;

import com.atguigu.boot.Bean.Car;
import com.atguigu.boot.Bean.Person;
import com.atguigu.boot.Bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.controller
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/22 - 16:14
 * @Version: v1.0
 */
@RestController
public class HelloController {

    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String HelloSpringBoot(){
        return "Hello world";
    }

    @RequestMapping("/Person")
    public Person testYml(){
        return person;
    }


}
