package com.employee.employeeservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

	@Bean
	public ModelMapper modelMapper() {

		return new ModelMapper();
	}

	@Bean
	public RestTemplate resttemplate() {

		return new RestTemplate();

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
