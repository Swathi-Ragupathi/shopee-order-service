package com.learn.microservices.shopeeorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.learn.microservices.shopeeorderservice")
@EnableEurekaClient
public class ShopeeOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeOrderServiceApplication.class, args);
	}

}
