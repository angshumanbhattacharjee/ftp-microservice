package com.capgemini.parkingSystem.ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class ParkingService {

	static Map<ParkingId, CustomerDetails> car;
	static int floor=1, section=1, compartment=1;
	
	public ParkingService() {
		car= new HashMap<ParkingId, CustomerDetails>();
	}
	
	public ParkingId addCar(CustomerDetails cust)
    {      
           if(compartment>10)
           {
                  section++;
                  compartment=1;
                  if(section>4)
                  {
                        floor++;
                        section=1;
                        compartment=1;
                  }
           }
        ParkingId key=new ParkingId(floor,section,compartment);
        
        
           car.put(key, cust);
           cust.setParkid(key);
           compartment++;
           
           return key;
    }
	
	public CustomerDetails GetCarByParkingId(ParkingId id) {
		return  car.get(id);
	}
	
	public void RemoveCarByParkingId(ParkingId id) {
		  car.remove(id);
		  //return car;
	}
	
	public static void main(String[] args) {
		ParkingService park= new ParkingService();
		CustomerDetails c1=new CustomerDetails("angshu","879845666");
		CustomerDetails c2=new CustomerDetails("arnab","879845666");
		CustomerDetails c3=new CustomerDetails("abhishek","879845666");
		CustomerDetails c4=new CustomerDetails("angbhatt","879845666");
		CustomerDetails c5=new CustomerDetails("angshuman","879845666");
		CustomerDetails c6=new CustomerDetails("anqwert","879845666");
		CustomerDetails c7=new CustomerDetails("angtutua","879845666");
		CustomerDetails c8=new CustomerDetails("bibhash","879845666");
		CustomerDetails c9=new CustomerDetails("sanu","879845666");
		System.out.println(park.addCar(c1));
		System.out.println(park.addCar(c2));
		System.out.println(park.addCar(c3));
		System.out.println(park.addCar(c4));
		System.out.println(park.addCar(c5));
		System.out.println(park.addCar(c6));
		System.out.println(park.addCar(c7));
		System.out.println(park.addCar(c8));
		System.out.println(park.addCar(c9));
		
		
		for(HashMap.Entry m: car.entrySet()) {
			System.out.println(m.getValue());
		}
		
		System.out.println("=============================================================");
		
		System.out.println(park.GetCarByParkingId(c7.getParkid()));
		
		park.RemoveCarByParkingId(c7.getParkid());
		
		System.out.println("=============================================================");
		
		for(HashMap.Entry m: car.entrySet()) {
			System.out.println(m.getValue());
		}
		
	}

	
}
