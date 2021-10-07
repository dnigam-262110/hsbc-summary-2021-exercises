package com.bootcamp.day3;

public class AutomobileUI 
{
//this should not know which object it uses
	public static void printVehicle(Vehicle vehicle) 
	{
		vehicle.wheels();
		System.out.println("Mileage: "+vehicle.getMileage());
		System.out.println("Price: "+vehicle.getPrice());
	}
}