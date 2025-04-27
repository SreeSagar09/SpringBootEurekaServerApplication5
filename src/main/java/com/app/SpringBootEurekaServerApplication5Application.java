package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication5Application.class, args);
		System.out.println("SpringBootEurekaServerApplication5Application is started..");
	}

}
