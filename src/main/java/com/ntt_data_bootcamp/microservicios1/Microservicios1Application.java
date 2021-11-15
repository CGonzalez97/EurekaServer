package com.ntt_data_bootcamp.microservicios1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservicios1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicios1Application.class, args);
	}

}
