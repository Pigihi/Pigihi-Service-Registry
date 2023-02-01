package com.pigihi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PigihiServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PigihiServiceRegistryApplication.class, args);
	}

}
