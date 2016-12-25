package com.deutschebank.dao;

import java.util.List;

import com.deutschebank.entities.ShopEntity;

public interface ShopDao {
    
	public void saveShop(ShopEntity shopEntity);
	public ShopEntity getShopEntityByName(String shopName);
	
	public List<ShopEntity> getAllShops();
	
	
	
}
