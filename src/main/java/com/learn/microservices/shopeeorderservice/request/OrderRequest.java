package com.learn.microservices.shopeeorderservice.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
	
	@NotNull(message = "User should not be empty")
	private Long userId;
	@NotNull(message = "Product should not be empty")
	private Long productId;
	private String paymentMode;
	@NotBlank(message = "order type should not be empty")
	private String orderType;

}
