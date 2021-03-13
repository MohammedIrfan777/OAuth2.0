package com.prokarma.productcatalogue;

import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableHystrix
@EnableFeignClients
@EnableSwagger2
public class ProductCatalogueServiceApplication {

	
	
	/*
	 * @LoadBalanced
	 * 
	 * @Bean public RestTemplate getRestTemplate() { return new RestTemplate();
	 * 
	 * }
	 */
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueServiceApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/product/**"))
				.apis(RequestHandlerSelectors.basePackage("com.prokarma.productcatalogue"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Product-Catalogue Service",
				"API for Product Catalogue Microservice",
				"1.0",
				"Open Source",
				new springfox.documentation.service.Contact("Satish Sirugodi", "https://www.pkglobal.com", "ssatish@pkglobal.com"),
				"API License",
				"https://www.pkglobal.com",
				Collections.emptyList()
				);
	}
	
}
