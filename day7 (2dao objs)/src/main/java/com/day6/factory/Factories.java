package com.day6.factory;
import com.day6.dao.EmployeeDaoInterface;
import com.day6.dao.EmployeeDaoListImpl;
import com.day6.dao.EmployeeDaoSetImpl;
import com.day6.service.EmployeeServiceImpl;
import com.day6.service.EmployeeServiceInterface;

public class Factories 
{
	public static EmployeeDaoInterface createDAOObject(int choice)
	{
		if(choice==1)
			return new EmployeeDaoListImpl();
		else if(choice==2)
			return new EmployeeDaoSetImpl();
		else
		return null;
	}
	public static EmployeeServiceInterface createServiceObject(EmployeeDaoInterface dao)
	{
		return new EmployeeServiceImpl(dao);
	}

}
