package com.deutschebank.rest.resources;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deutschebank.rest.dto.ShopDto;
import com.deutschebank.rest.response.RestResponse;

@RestController
public class ShopResource {

	@RequestMapping(value="/shops", method=RequestMethod.POST)
	public RestResponse addShop(ShopDto shop) {
		
		
		
		RestResponse restResponse = new RestResponse();
		restResponse.setMessgae("successfully added shop");
		restResponse.setStatus(HttpStatus.OK);
		return restResponse;
	}
	
}
