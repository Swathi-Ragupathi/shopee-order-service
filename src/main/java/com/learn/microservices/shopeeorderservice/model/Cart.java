package com.learn.microservices.shopeeorderservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

public class Cart extends BaseEntity {

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(columnDefinition = "CHAR(16)", length = 16)
	private String cartId;
	private Long userId;
	private Long productId;
	private Date cartAddedDate;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
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

	public Date getCartAddedDate() {
		return cartAddedDate;
	}

	public void setCartAddedDate(Date cartAddedDate) {
		this.cartAddedDate = cartAddedDate;
	}

}
