package com.learn.microservices.shopeeorderservice.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.shopeeorderservice.constants.DeliveryStatus;
import com.learn.microservices.shopeeorderservice.constants.ErrorConstants;
import com.learn.microservices.shopeeorderservice.constants.PaymentMode;
import com.learn.microservices.shopeeorderservice.constants.PaymentStatus;
import com.learn.microservices.shopeeorderservice.dto.OrderInfoDTO;
import com.learn.microservices.shopeeorderservice.exception.OrderServiceException;
import com.learn.microservices.shopeeorderservice.mapper.EntityToDtoMapper;
import com.learn.microservices.shopeeorderservice.model.OrderInfo;
import com.learn.microservices.shopeeorderservice.proxy.ProductServiceProxy;
import com.learn.microservices.shopeeorderservice.proxy.UserServiceProxy;
import com.learn.microservices.shopeeorderservice.repository.OrderInfoRepository;
import com.learn.microservices.shopeeorderservice.response.ProductDetailsResponseDTO;
import com.learn.microservices.shopeeorderservice.response.ResponseData;
import com.learn.microservices.shopeeorderservice.response.UserInfoResponseDTO;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	UserServiceProxy userServiceProxy;

	@Autowired
	ProductServiceProxy productServiceProxy;

	@Autowired
	OrderInfoRepository orderInfoRepository;

	@Autowired
	EntityToDtoMapper entityToDTOMapper;

	@PostMapping("/placeOrder/{userId}/{productId}/{quantity}")
	public ResponseEntity<ResponseData> placeOrder(@PathVariable("userId") Long userId,
			@PathVariable("productId") Long productId, @PathVariable("quantity") Integer quantity) {
		UserInfoResponseDTO userInfoResponseDTO = userServiceProxy.userById(userId).getBody();
		ProductDetailsResponseDTO productById = productServiceProxy.productById(productId).getBody();
		OrderInfo newOrder = OrderInfo.builder().userId(userId).productId(productId)
				.deliveryStatus(DeliveryStatus.ORDERED_PAYMENT_PENDING).paymentStatus(PaymentStatus.NOT_PAID)
				.currencyCode(productById.getCurrencyCode()).quantity(quantity)
				.amountPerQuantity(productById.getActualPrice()).totalAmount(quantity * productById.getActualPrice())
				.contactNumber(userInfoResponseDTO.getPhoneNumber()).orderId(RandomStringUtils.randomAlphanumeric(16))
				.build();
		orderInfoRepository.save(newOrder);
		return ResponseEntity.ok(ResponseData.builder().message("Order Placed").status(HttpStatus.OK.name()).build());
	}

	@PostMapping("/paid/{orderId}/{paymentMode}")
	public ResponseEntity<OrderInfoDTO> paymentOrder(@PathVariable("orderId") String orderId,
			@PathVariable("paymentMode") String paymentMode) {
		OrderInfo order = orderInfoRepository.findByOrderId(orderId);
		if (order == null)
			throw new OrderServiceException(ErrorConstants.ORDER_NOT_FOUND);
		LocalDate today = LocalDate.now();
		order.setPaymentStatus(
				PaymentMode.COD.name().equals(paymentMode) ? order.getPaymentStatus() : PaymentStatus.PAID);
		order.setPaymentMode(PaymentMode.valueOf(paymentMode));
		order.setDeliveryStatus(DeliveryStatus.ORDERED);
		order.setTrackingId(RandomStringUtils.randomAlphanumeric(20));
		order.setEstimatedDeliveryDate(Date.from(today.plusDays(10).atStartOfDay(ZoneId.systemDefault()).toInstant()));
		orderInfoRepository.save(order);
		return ResponseEntity.ok(entityToDTOMapper.orderInfoEntityToDTO(order));
	}

}
