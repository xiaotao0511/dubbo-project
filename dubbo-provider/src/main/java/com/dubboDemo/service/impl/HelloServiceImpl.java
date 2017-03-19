package com.dubboDemo.service.impl;

import com.dubboDemo.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello,I am provider demo!");
	}

}
