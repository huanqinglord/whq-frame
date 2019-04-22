package com.whq;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/4/20 9:20
 * @desc: 简单测试springMVC
 */
@Controller
@RequestMapping("/user")
public class LoginAction implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("测试加载！");
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute("a") Users users){
        System.out.println("方式2接收到的用户名：" + users.getUsername());
        System.out.println("方式2接收到的密码：" + users.getPassword());
        System.out.println("Login success!");
        return "success";
    }
}
