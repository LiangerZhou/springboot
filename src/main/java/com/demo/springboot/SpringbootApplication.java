package com.demo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@MapperScan(basePackages = "com.demo.springboot.mapper")
@SpringBootApplication //same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringbootApplication{

    private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		
		logger.info("开始运行spring boot");
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
}
