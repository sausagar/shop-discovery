package com.deutschebank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deutschebank.dao.ShopDao;
import com.deutschebank.entities.ShopEntity;
import com.deutschebank.rest.dto.ShopDto;

@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ShopDao shopDao;
	
	@Override
	public ShopEntity getShopByName(String name) {
		
		return null;
	}

	@Override
	public void saveShop(ShopDto shopDto) {
		ShopEntity shopEntity = new ShopEntity();
		shopDao.saveShop(shopEntity);
	}
	
	@Override
	public ShopEntity getNearsetShop(Double lattitue, Double longitude) {
		// TODO Auto-generated method stub
		return null;
	}

}
