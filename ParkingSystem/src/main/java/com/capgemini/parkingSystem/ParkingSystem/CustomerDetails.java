package com.capgemini.parkingSystem.ParkingSystem;

import java.time.LocalDate;

public class CustomerDetails {
	
	String customerName;
	String phoneNumber;
	LocalDate parkingTime;
	ParkingId parkid;
	
	
	public CustomerDetails(String customerName, String phoneNumber) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public LocalDate getParkingTime() {
		return parkingTime;
	}


	public ParkingId getParkid() {
		return parkid;
	}
	
	


	public void setParkid(ParkingId parkid) {
		this.parkid = parkid;
	}


	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", parkingTime="
				+ parkingTime + ", parkid=" + parkid + "]";
	}
	
	
	
	
}
