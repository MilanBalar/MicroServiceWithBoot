package com.boot.web.email.webservice.APIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayMicroServiceApplication.class, args);
	}

}
