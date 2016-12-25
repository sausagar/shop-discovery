package com.deutschebank.service;

import com.deutschebank.entities.ShopEntity;
import com.deutschebank.rest.dto.ShopDto;

public interface ShopService {

	ShopEntity getShopByName(String name);
	ShopEntity getNearsetShop(Double lattitue, Double longitude);
	void saveShop(ShopDto shopDto);
	
}
