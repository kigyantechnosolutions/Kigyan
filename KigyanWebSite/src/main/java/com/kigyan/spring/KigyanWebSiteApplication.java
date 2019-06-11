package com.kigyan.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.kigyan.spring.repository")
public class KigyanWebSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(KigyanWebSiteApplication.class, args);
	}

}
