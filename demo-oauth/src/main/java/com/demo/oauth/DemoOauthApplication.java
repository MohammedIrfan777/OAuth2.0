package com.demo.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauthApplication.class, args);
	}

}
