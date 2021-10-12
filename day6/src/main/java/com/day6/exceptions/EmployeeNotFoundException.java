package com.day6.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception
{
    private String message;
	public EmployeeNotFoundException(String message) 
	{
		super(message);
	}
}
