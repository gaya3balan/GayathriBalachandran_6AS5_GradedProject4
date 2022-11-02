package com.greatlearning.EmployeeManagementRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.greatlearning.EmployeeManagementRest" })
public class EmployeeManagementRestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRestWebApplication.class, args);
	}

}
