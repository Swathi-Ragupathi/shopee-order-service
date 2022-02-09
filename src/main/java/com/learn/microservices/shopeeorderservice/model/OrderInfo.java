package com.learn.microservices.shopeeorderservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.learn.microservices.shopeeorderservice.constants.DeliveryStatus;
import com.learn.microservices.shopeeorderservice.constants.PaymentMode;
import com.learn.microservices.shopeeorderservice.constants.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo extends BaseEntity {

	@Column(columnDefinition = "CHAR(16)", length = 16, unique = true, nullable =false, updatable = false)
	private String orderId;
	private Long userId;
	private Long productId;
	@Column(columnDefinition = "CHAR(20)", length = 20, unique = true, updatable = false)
	private String trackingId;
	private Integer quantity;
	private Double amountPerQuantity;
	private Double totalAmount;
	@Enumerated(value = EnumType.STRING)
	private PaymentMode paymentMode;
	@Enumerated(value = EnumType.STRING)
	private DeliveryStatus deliveryStatus;
	@Enumerated(value = EnumType.STRING)
	private PaymentStatus paymentStatus;
	private String currencyCode;
	private String contactNumber;
	private Date estimatedDeliveryDate;
	private Date actualDeliveryDate;
	private Date returnInitiatedDate;
	private Date returnedDate;

	  
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public Date getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(Date actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public Date getReturnInitiatedDate() {
		return returnInitiatedDate;
	}

	public void setReturnInitiatedDate(Date returnInitiatedDate) {
		this.returnInitiatedDate = returnInitiatedDate;
	}

	public Date getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double actualPrice) {
		this.totalAmount = actualPrice;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmountPerQuantity() {
		return amountPerQuantity;
	}

	public void setAmountPerQuantity(Double amountPerQuantity) {
		this.amountPerQuantity = amountPerQuantity;
	}
	
	

}
