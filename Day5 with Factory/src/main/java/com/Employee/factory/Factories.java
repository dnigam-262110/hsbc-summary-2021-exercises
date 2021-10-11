package com.Employee.factory;

import com.Employee.dao.EmployeeDAOInterface;
import com.Employee.dao.EmployeeDaoArrayImpl;
import com.Employee.service.EmployeeServiceImpl;
import com.Employee.service.EmployeeServiceInterface;

public class Factories 
{
	public EmployeeDAOInterface createDAOObject()
	{
		return new EmployeeDaoArrayImpl();
	}
	public EmployeeServiceInterface createServiceObject()
	{
		return new EmployeeServiceImpl();
	}

}
