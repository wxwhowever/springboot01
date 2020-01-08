package com.wxw.springboot01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Springboot01Application {

	@Value("${server.address}")
	private String address;

	public static void main(String[] args) {
		SpringApplication.run(Springboot01Application.class, args);
	}


	@RequestMapping("hello")
	public void hello(){
		System.out.println(address);
	}

}
