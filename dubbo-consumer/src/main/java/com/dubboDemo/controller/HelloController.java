package com.dubboDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubboDemo.config.RedisConfig;
import com.dubboDemo.service.HelloService;
import com.dubboDemo.service.SimpleStaticService;

/**
 * xiaotao
 */
@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private RedisConfig redisConfig;
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	helloService.sayHello();
    	System.out.println("static item data:" + SimpleStaticService.getStaticItem());
    	System.out.println("static file data:" + SimpleStaticService.getStaticFileData());
        return redisConfig.getHost()+":"+redisConfig.getPort();
    }
}
