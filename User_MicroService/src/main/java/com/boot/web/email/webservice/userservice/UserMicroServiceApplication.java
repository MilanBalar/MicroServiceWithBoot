package com.boot.web.email.webservice.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserMicroServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserMicroServiceApplication.class, args);
        System.out.println("####-----boot is ready----####");
    }

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
