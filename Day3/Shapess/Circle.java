package com.bootcamp.day3;
public class Circle implements Shape
{
	private double radius;
	public String area(double radius) 
	{
		String str=Double.toString(3.14*radius*radius);
		return str;
	}

}
