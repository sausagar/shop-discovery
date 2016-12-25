package com.deutschebank.service;

import java.util.List;

import com.deutschebank.entities.ShopEntity;
import com.deutschebank.rest.dto.ShopDto;
import com.deutschebank.rest.exception.SDTechnicalException;


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
	 * Returns the nearest shops from the given location
	 * @throws SDTechnicalException 
	 * 
	 */
	public ShopEntity getNearsetShop(Double lattitue, Double longitude) throws SDTechnicalException;
	
	/**
	 * @param shopDto
	 * save shop
	 * @return 
	 * @throws SDTechnicalException 
	 */
	public ShopEntity saveShop(ShopDto shopDto) throws SDTechnicalException;
	
	/**
	 * @return
	 * 
	 * Gives the list of all available shops
	 * 
	 */
	public List<ShopEntity> getAllShops();
	
}
