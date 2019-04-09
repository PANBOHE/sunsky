package com.example.sunsky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.example.sunsky.dao") 
@SpringBootApplication
public class SunskyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SunskyApplication.class, args);
	}
	
	
	 @Override//为了打包springboot项目
	    protected SpringApplicationBuilder configure(
	            SpringApplicationBuilder builder) {
	        return builder.sources(this.getClass());
	    }


}
