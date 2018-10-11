package com.capgemini.employee.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
class DemoMicroserviceEmployeeproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroserviceEmployeeproducerApplication.class, args);
	}
}
