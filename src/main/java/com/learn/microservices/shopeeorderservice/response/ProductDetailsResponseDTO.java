package com.learn.microservices.shopeeorderservice.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailsResponseDTO {
	private Long id;
	private Long categoryId;
	private String name;
	private String description;
	private Double mrp;
	private Double actualPrice;
	private String currencyCode;
	private String imageUrl;
	private Integer availableStock;
	private boolean inStock;
	private boolean active;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifiedDate;

}
