package com.rosseneri.ergoserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErgoServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErgoServiceRegistryApplication.class, args);
	}

}
