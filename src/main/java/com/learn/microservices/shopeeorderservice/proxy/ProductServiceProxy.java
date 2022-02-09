package com.learn.microservices.shopeeorderservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learn.microservices.shopeeorderservice.response.ProductDetailsResponseDTO;

@FeignClient(name="shopee-product-service/shopee-product-service/api/product")
public interface ProductServiceProxy {

	
	@GetMapping("/{id}")
	public ResponseEntity<ProductDetailsResponseDTO> productById(@PathVariable("id") Long productDetailsId) ;
}
