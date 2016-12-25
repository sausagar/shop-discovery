package com.deutschebank.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.deutschebank.entities.ShopEntity;

/**
 * @author Saurabh.Sagar
 * This is an in-memory Datastore
 * Stores the shop specific data in a map
 * Assumption : Shop names are unique
 */
public class InMemoryDataStore {
	
	private Map<String, ShopEntity> shops = null;

	public InMemoryDataStore() {
		shops = new HashMap<>();
	}
	
	public ShopEntity getShopEntityByName(String shopName) {
        return shops.get(shopName);		
	}
	
	public void saveShop(ShopEntity shop) {
		shops.put(shop.getShopName(), shop);
	}

	public List<ShopEntity> getAllShops() {
		return Collections.unmodifiableList(new ArrayList<>(shops.values()));
	}
	
}
