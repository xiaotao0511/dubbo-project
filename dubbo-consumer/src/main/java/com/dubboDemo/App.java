package com.dubboDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@SpringBootApplication  
@ImportResource(locations={"disconf.xml","dubbo-consumer.xml"}) 
public class App 
{
	/**  
     * Main 方法启动项  
     */  
    public static void main(String[] args) {  
        SpringApplication.run(App.class, args);  
        System.out.println("============= dubbo-consumer Start ON SpringBoot Success =============");  
    }
}
