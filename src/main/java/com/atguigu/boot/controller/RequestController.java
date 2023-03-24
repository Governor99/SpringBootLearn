package com.atguigu.boot.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: RequestController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/27 - 18:21
 * @Version: v1.0
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goTopage(HttpServletRequest request){
        request.setAttribute("msg","success");
        request.setAttribute("code",100);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                          @RequestAttribute("code")Integer code,
                          HttpServletRequest request){
        Object msg1 = request.getAttribute("msg");
        Map<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("msg1",msg1);
        return map;
    }


}
