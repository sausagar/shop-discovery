package com.deutschebank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deutschebank.entities.ShopEntity;

@Repository
public class ShopDaoImpl implements ShopDao {

	@Autowired
	private InMemoryDataStore dataStore;
	
	@Override
	public void saveShop(ShopEntity shopEntity) {
		dataStore.saveShop(shopEntity);
		
	}

	@Override
	public ShopEntity getShopEntityByName(String shopName) {
		return dataStore.getShopEntityByName(shopName);
		
	}

	@Override
	public List<ShopEntity> getAllShops() {
		
		return dataStore.getAllShops();
	}

}
