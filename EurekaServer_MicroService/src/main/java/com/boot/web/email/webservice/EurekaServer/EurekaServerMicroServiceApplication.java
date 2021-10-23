package com.boot.web.email.webservice.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMicroServiceApplication.class, args);
		System.out.println("-------server is rugging mode-----------");
	}

}
