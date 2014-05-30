package org.freddy.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml" })
public class HotelTest {
	
	@Autowired
	private Hotel hotel;
	
	@Test
	public void testHotel() {
		System.out.println("Starting test...");
		Assert.assertEquals(hotel.getName(), "Hotel Excelsior");
		Assert.assertEquals(hotel.getManager().getName(), "Freddy");
		Assert.assertEquals(hotel.getManager().getFirstWorker().getName(), "David");
		
		
	}

}
