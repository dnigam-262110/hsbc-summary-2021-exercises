package com.day6.exceptions;
@SuppressWarnings("serial")
public class EmployeeAlreadyExistException extends Exception
{
    private String message;
	public EmployeeAlreadyExistException(String message) 
	{
		super(message);
	}
}
