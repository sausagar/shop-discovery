package com.deutschebank.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ShopDto {

	private String shopName;
	private AddressDto shopAddress;
	
	@JsonProperty(value="shopName")
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@JsonProperty(value="shopAddress")
	public AddressDto getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(AddressDto shopAddress) {
		this.shopAddress = shopAddress;
	}
	
	@Override
	public String toString() {
		return "ShopDto [shopName=" + shopName + ", shopAddress=" + shopAddress + "]";
	}
	
	
	
}
