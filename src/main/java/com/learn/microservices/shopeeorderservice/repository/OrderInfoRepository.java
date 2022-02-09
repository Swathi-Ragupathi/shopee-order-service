package com.learn.microservices.shopeeorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.microservices.shopeeorderservice.model.OrderInfo;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {

	OrderInfo findByOrderId(String orderId);

}
