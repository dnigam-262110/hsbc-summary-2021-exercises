package com.day6.factory;
import com.day6.dao.EmployeeDaoInterface;
import com.day6.dao.EmployeeDaoListImpl;
import com.day6.service.EmployeeServiceImpl;
import com.day6.service.EmployeeServiceInterface;

public class Factories 
{
	public static EmployeeDaoInterface createDAOObject()
	{
		return new EmployeeDaoListImpl();
	}
	public static EmployeeServiceInterface createServiceObject()
	{
		return new EmployeeServiceImpl();
	}

}
