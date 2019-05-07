package com.whq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/5/7 20:42
 * @desc:
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
    }
}
