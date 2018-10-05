package com.capgemini.parkingSystem.ParkingSystem;



import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class ParkingServiceTest {

	CustomerDetails cus;
	ParkingService par;
	@Test
	public void addCarTest_1() {
		 cus= new CustomerDetails("qwerty","8794563215");
		 par= new ParkingService();
		
		assertEquals("111",par.addCar(cus).toString());
	}
	
	@Test
	public void getCarByParkingIdTest() {
		ParkingId parkid= new ParkingId(1,1,3);
		CustomerDetails cus= new CustomerDetails("abhishek","879845666");
		cus.setParkid(parkid);
		ParkingService par= new ParkingService();
		//par.addCar(cus);
		assertEquals(parkid, (cus.getParkid()));
		
		
	}
}
