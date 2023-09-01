package com.trainee;

public class son extends father {
	
	public void car() {
		
		int car=50000;
		System.out.println("my own car =" + car);
	}
	
	public void theater() {
		
		
		String chennai = "sathyam";
		
		System.out.println("my own theater ="+ chennai);
		
		
	}

	public static void main(String[] args) {
		
		son asset = new son();
		asset.house();
		asset.theater();
		asset.cottage();
		asset.land();
		asset.car();
		asset.cottage();
	}
}
