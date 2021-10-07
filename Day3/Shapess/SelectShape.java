package com.bootcamp.day3;

public class SelectShape 
{
	public static void main(String args[])
	{
		System.out.println("------------Circle Class---------");
		Circle circle=new Circle();
		FindArea.printArea(circle,2.0);
		
		System.out.println("------------Sphere Class---------");
		Sphere sphere=new Sphere();
		FindArea.printArea(sphere,2.0);
	}

}
