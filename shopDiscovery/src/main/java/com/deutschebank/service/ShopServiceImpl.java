package com.deutschebank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deutschebank.dao.ShopDao;
import com.deutschebank.entities.ShopAddressEntity;
import com.deutschebank.entities.ShopEntity;
import com.deutschebank.integration.Coordinate;
import com.deutschebank.integration.GeoCodeLocationService;
import com.deutschebank.rest.dto.ShopDto;
import com.deutschebank.rest.exception.SDTechnicalException;
import com.deutschebank.utility.DistanceCalculator;

@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ShopDao shopDao;
	
	@Autowired GeoCodeLocationService locatorService;
	
	
	@Override
	public ShopEntity getShopByName(String name) {
		
		return shopDao.getShopEntityByName(name);
	}

	@Override
	public ShopEntity saveShop(ShopDto shopDto) throws SDTechnicalException {
		Coordinate addressCoordinates = locatorService.getCoordinatesForAddress(shopDto.getShopAddress().getZipCode());
    	ShopEntity shopEntity = new ShopEntity();
		ShopAddressEntity addressEntity = new ShopAddressEntity();
		addressEntity.setShopNumber(shopDto.getShopAddress().getShopNumber());
		addressEntity.setZipCode(shopDto.getShopAddress().getZipCode());
		shopEntity.setShopName(shopDto.getShopName());
        shopEntity.setShopAddress(addressEntity);
        shopEntity.setShopLatitude(addressCoordinates.getLat());
        shopEntity.setShopLongitude(addressCoordinates.getLog());
		shopDao.saveShop(shopEntity);
		return shopEntity;
	}
	
	@Override
	public ShopEntity getNearsetShop(Double lattitue, Double longitude) throws SDTechnicalException {
		
		ShopEntity nearestShop = null;
		double minDistance = Double.MAX_VALUE ; // intialize to arbitary large value
		List<ShopEntity> shopEntities = shopDao.getAllShops();
		if(shopEntities == null || shopEntities.isEmpty()) {
			throw new SDTechnicalException("No Shops present ");
		}
		
		for(ShopEntity shop : shopEntities) {
			double distance = DistanceCalculator.distance(shop.getShopLatitude(), shop.getShopLongitude(), 
					 lattitue, longitude);
			if(distance <= minDistance) {
				nearestShop = shop;
				minDistance = distance;
			}
			
		}
		
		return nearestShop;
	}

	@Override
	public List<ShopEntity> getAllShops() {
		return shopDao.getAllShops();
	}

}
