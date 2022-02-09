package com.learn.microservices.shopeeorderservice.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfoDTO  {

	private Long id;
	private String orderId;
	private Long userId;
	private Long productId;
	private String trackingId;
	private Double totalAmount;
	private String paymentMode;
	private String deliveryStatus;
	private String paymentStatus;
	private String currencyCode;
	private String contactNumber;
	private Date estimatedDeliveryDate;
	private Date actualDeliveryDate;
	private Date returnInitiatedDate;
	private Date returnedDate;
	private Double amountPerQuantity;
	private Integer quantity;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifiedDate;

}
