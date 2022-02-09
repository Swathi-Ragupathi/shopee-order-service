package com.learn.microservices.shopeeorderservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learn.microservices.shopeeorderservice.response.UserInfoResponseDTO;

@FeignClient(name="shopee-users-service/shopee-users-service/api/user")
public interface UserServiceProxy {

	
	@GetMapping("/{id}")
	public ResponseEntity<UserInfoResponseDTO> userById(@PathVariable("id") Long userId);
}
