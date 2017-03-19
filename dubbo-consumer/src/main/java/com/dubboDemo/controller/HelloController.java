package com.dubboDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubboDemo.service.HelloService;

/**
 * xiaotao
 */
@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	helloService.sayHello();
        return "Hello World!";
    }
}
