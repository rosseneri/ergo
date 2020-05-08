package com.rosseneri.ergoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ErgoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErgoApiGatewayApplication.class, args);
	}
}