package com.deutschebank.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deutschebank.dao.ShopDao;
import com.deutschebank.entities.ShopAddressEntity;
import com.deutschebank.entities.ShopEntity;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShopDaoTest {

	@Autowired
	private ShopDao shopDao;
	
	/**
	 * This will test the save of the shop with address and 
	 * the retrieval for the same
	 */
	@Test
	public void saveShopTest() {
		ShopEntity shopEntity = new ShopEntity();
		shopEntity.setShopName("abc");
		shopEntity.setShopLatitude(99.99);
		shopEntity.setShopLongitude(99.90);
	    ShopAddressEntity addressEntity = new ShopAddressEntity();
	    addressEntity.setShopNumber("B-152");
	    addressEntity.setZipCode("411028");
	    shopEntity.setShopAddress(addressEntity);
	    shopDao.saveShop(shopEntity);
	    assertEquals(1,shopDao.getAllShops().size());
	    ShopEntity shopEntity2 = new ShopEntity();
		shopEntity2.setShopName("abcs");
		shopEntity2.setShopLatitude(01.99);
		shopEntity2.setShopLongitude(01.90);
	    ShopAddressEntity addressEntity2 = new ShopAddressEntity();
	    addressEntity2.setShopNumber("B-152");
	    addressEntity2.setZipCode("411028");
	    shopEntity2.setShopAddress(addressEntity);
	    shopDao.saveShop(shopEntity2); 
	    assertEquals(2,shopDao.getAllShops().size());
	    
	    assertEquals(new Double(1.99), shopDao.getShopEntityByName("abcs").getShopLatitude());
	    
	}

	
	
	
}
