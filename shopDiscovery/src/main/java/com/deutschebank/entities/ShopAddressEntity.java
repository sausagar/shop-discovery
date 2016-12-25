package com.deutschebank.entities;

/**
 * @author Saurabh.Sagar
 * EntityObject for Shop Address
 *
 */
public class ShopAddressEntity implements Entity{

	private String shopNumber;
	private String zipCode;
	
	public String getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	
}
