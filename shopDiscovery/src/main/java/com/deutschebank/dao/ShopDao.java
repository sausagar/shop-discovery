package com.deutschebank.dao;

import java.util.List;

import com.deutschebank.entities.ShopEntity;

public interface ShopDao {
    
	/**
	 * @param shopEntity
	 * Will store the shop in the database
	 * 
	 */
	public void saveShop(ShopEntity shopEntity);
	
	
	/**
	 * @param shopName
	 * @return
	 * 
	 * returns the shop provided the shopName.
	 * It is assumed shop names are unique 
	 * 
	 */
	public ShopEntity getShopEntityByName(String shopName);
	
	
	/**
	 * @return
	 * 
	 * return the unmodifiable list of all the shops present in the database
	 */
	public List<ShopEntity> getAllShops();
	
	
	
}
