package com.learn.microservices.shopeeorderservice.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDTO {

	private Long userInfoId;
	private Long id;
	private boolean primaryAddress;
	private String streetLine1;
	private String streetLine2;
	private String postalCode;
	private String country;
	private String state;
	private String city;
	private Date createdDate;
	private Date modifiedDate;
	
}
