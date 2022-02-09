package com.learn.microservices.shopeeorderservice.mapper;

import org.springframework.stereotype.Component;

import com.learn.microservices.shopeeorderservice.config.CustomBeanUtils;
import com.learn.microservices.shopeeorderservice.dto.OrderInfoDTO;
import com.learn.microservices.shopeeorderservice.model.OrderInfo;

@Component
public class EntityToDtoMapper {

	public OrderInfoDTO orderInfoEntityToDTO(OrderInfo orderInfo) {
		OrderInfoDTO orderInfoDTO = new OrderInfoDTO();
		CustomBeanUtils.copyProperties(orderInfo, orderInfoDTO);
		orderInfoDTO.setPaymentMode(orderInfo.getPaymentMode().name());
		orderInfoDTO.setPaymentStatus(orderInfo.getPaymentStatus().name());
		orderInfoDTO.setDeliveryStatus(orderInfo.getDeliveryStatus().name());
		return orderInfoDTO;
	}
}
