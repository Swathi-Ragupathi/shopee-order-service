package com.learn.microservices.shopeeorderservice.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
	private Long id;
	private String cartId;
	private Long userId;
	private Long productId;
	private Date cartAddedDate;
	private Date createdDate;
	private Date modifiedDate;

}
