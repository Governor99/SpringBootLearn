package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import java.nio.file.NotLinkException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: ParameterTestController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/27 - 17:52
 * @Version: v1.0
 */
@RestController
public class ParameterTestController {

    @RequestMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-agent") String userAgent,
                                     @RequestHeader Map<String,String> header){
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("username",username);
        map.put("pv",pv);
        map.put("userAgent",userAgent);
        map.put("header",header);
        return map;
    }

    //car/user;name=Black/hobby;something=chang,tiao,rap,basketball
    @GetMapping("/car/{user}/{hobby}")
    public Map carsSell(@MatrixVariable("name") String user,@MatrixVariable("something") String hobby){
        Map<String,Object> map = new HashMap<>();
        map.put("name",user);
        map.put("something",hobby);

        return map;
    }

    //car/1;age=18/2;age=30
    @GetMapping("/boss/{bossId}/{empId}")
    private Map carAge(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,@MatrixVariable(value = "age",pathVar = "empId") Integer emplpyee){
        Map<String,Object> map = new HashMap<>();
        map.put("boss",bossAge);
        map.put("employee",emplpyee);
        return map;
    }




}
