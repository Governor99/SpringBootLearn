package com.atguigu.boot.Bean;

/**
 * ClassName: User
 * Package: com.atguigu.boot.Bean
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/23 - 18:08
 * @Version: v1.0
 */
public class User {

    private String name;

    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
