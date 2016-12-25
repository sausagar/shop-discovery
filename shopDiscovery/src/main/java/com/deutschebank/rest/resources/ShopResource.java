package com.deutschebank.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deutschebank.entities.ShopEntity;
import com.deutschebank.rest.dto.ShopDto;
import com.deutschebank.rest.exception.SDTechnicalException;
import com.deutschebank.rest.response.RestResponse;
import com.deutschebank.service.ShopService;

@RestController
public class ShopResource {

	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/shops", method = RequestMethod.POST)
	public RestResponse addShop(@RequestBody ShopDto shop) throws SDTechnicalException {
		ShopEntity shopEntity = shopService.saveShop(shop);
		RestResponse restResponse = new RestResponse();
		restResponse.setMessgae("successfully added shop");
		restResponse.setStatus(HttpStatus.OK);
		restResponse.setEntity(shopEntity);
		return restResponse;
	}
	
	@RequestMapping(value = "/shops", method = RequestMethod.GET)
	public List<ShopEntity> getAllShops() throws SDTechnicalException {
		return shopService.getAllShops();
		
	}

	@RequestMapping(value = "/shop/nearest", method = RequestMethod.GET)
	public ShopEntity getNearestShop(@RequestParam(value="lat") String lat, @RequestParam(value="lon") String lon) 
			throws SDTechnicalException {
		if(lat==null || lon == null) {
			throw new SDTechnicalException("lattitude or longitude cannot be null");
		}
		ShopEntity nearestShops = shopService.getNearsetShop(Double.parseDouble(lat), Double.parseDouble(lon));
		return nearestShops;
	}

}
