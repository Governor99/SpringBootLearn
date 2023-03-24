package com.atguigu.boot.Bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Person
 * Package: com.atguigu.boot.Bean
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/26 - 17:39
 * @Version: v1.0
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salarys;
    private Map<String,List<Pet>> allPets;



}
