package com.studentmanagment.studentmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentmanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagmentApplication.class, args);
	}

}
