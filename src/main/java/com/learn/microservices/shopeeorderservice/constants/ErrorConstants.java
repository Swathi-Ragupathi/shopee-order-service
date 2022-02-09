package com.learn.microservices.shopeeorderservice.constants;

import org.springframework.http.HttpStatus;

public enum ErrorConstants {

	UNABLE_TO_PROCESS("1000", "Failure Occurs", HttpStatus.INTERNAL_SERVER_ERROR),
	ORDER_NOT_FOUND("1001", "Requested Order is unavailable", HttpStatus.NOT_FOUND),
	PRODUCT_NOT_FOUND("1002", "Requested Product is unavailable", HttpStatus.NOT_FOUND),
	CART_NOT_FOUND("1003", "Requested Cart is unavailable", HttpStatus.NOT_FOUND),
	USER_NOT_FOUND("1004", "Error !! User details not matched with our system", HttpStatus.NOT_FOUND);
	

	String code;
	String message;
	HttpStatus httpStatus;

	ErrorConstants(String code, String message, HttpStatus statusCode) {
		this.code = code;
		this.message = message;
		this.httpStatus = statusCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus statusCode) {
		this.httpStatus = statusCode;
	}

}
