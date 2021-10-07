package com.bootcamp.day3;

public class SelectVehicle {

	public static void main(String[] args) 
	{
		System.out.println("--------Bike Instances:--------");
		System.out.println("KTM instance");
		Ktm ktm = new Ktm();
		AutomobileUI.printVehicle(ktm);
		System.out.println("Royal Enfield instance");
		RoyalEnfield rf = new RoyalEnfield();
		AutomobileUI.printVehicle(rf);
		
		System.out.println("--------Car Instances:--------");
		System.out.println("Alto instance");
		Alto alto= new Alto();
		AutomobileUI.printVehicle(alto);
		System.out.println("Skoda instance");
		Skoda sk = new Skoda();
		AutomobileUI.printVehicle(sk);
		System.out.println("BMW instance");
		BMW bmw = new BMW();
		AutomobileUI.printVehicle(bmw);
	}

}