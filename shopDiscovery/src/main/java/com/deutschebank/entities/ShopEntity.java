package com.deutschebank.entities;

public class ShopEntity implements Entity{

	private String shopName;

	private ShopAddressEntity shopAddress;

	private Double shopLongitude;

	private Double shopLatitude;

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Double getShopLongitude() {
		return shopLongitude;
	}

	public void setShopLongitude(Double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	public Double getShopLatitude() {
		return shopLatitude;
	}

	public void setShopLatitude(Double shopLatitude) {
		this.shopLatitude = shopLatitude;
	}

	public ShopAddressEntity getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(ShopAddressEntity shopAddress) {
		this.shopAddress = shopAddress;
	}
	
	
	
}
