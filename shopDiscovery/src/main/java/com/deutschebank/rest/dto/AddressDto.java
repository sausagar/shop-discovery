package com.deutschebank.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AddressDto {

	private String shopNumber;
	private String zipCode;
	
	@JsonProperty(value="number")
	public String getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	
	@JsonProperty(value="postCode")
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "AddressDto [shopNumber=" + shopNumber + ", zipCode=" + zipCode + "]";
	}
	
	
	
}
