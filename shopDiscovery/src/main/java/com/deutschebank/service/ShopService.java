package com.deutschebank.service;

import com.deutschebank.entities.ShopEntity;
import com.deutschebank.rest.dto.ShopDto;


/**
 * @author Saurabh.Sagar
 *
 */
public interface ShopService {

	/**
	 * @param name
	 * @return
	 * fetches shop based on name
	 */
	public ShopEntity getShopByName(String name);
	
	/**
	 * @param lattitue
	 * @param longitude
	 * @return
	 * 
	 * Returns the nearest shop from the given location
	 * 
	 */
	public ShopEntity getNearsetShop(Double lattitue, Double longitude);
	
	/**
	 * @param shopDto
	 * save shop
	 */
	public void saveShop(ShopDto shopDto);
	
}
