package com.atguigu.boot.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Car
 * Package: com.atguigu.boot.Bean
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/23 - 18:28
 * @Version: v1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;

    private Integer price;


}
