package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: ViewTestController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author:Black
 * @Create: 2023/3/28 - 16:01
 * @Version: v1.0
 */
@Controller
public class ViewTestController {

    @RequestMapping("/atguigu")
    public String atguigu(Model model){
        model.addAttribute("msg","测试视图解析器");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }

}
