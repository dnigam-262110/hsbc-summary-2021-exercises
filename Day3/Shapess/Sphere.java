package com.bootcamp.day3;
public class Sphere implements Shape 
{
	private double radius;
	public String area(double radius) 
	{
		String str=Double.toString(4*3.14*radius*radius);
		return str;
	}
}
