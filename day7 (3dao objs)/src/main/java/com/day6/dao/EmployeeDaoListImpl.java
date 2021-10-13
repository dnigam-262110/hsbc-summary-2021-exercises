package com.day6.dao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.day6.beans.Employee;
import com.day6.factory.SortID;
import com.day6.factory.SortNames;
import com.day6.factory.SortSalary;
public class EmployeeDaoListImpl implements EmployeeDaoInterface 
{
	private static List<Employee> employeeDb = new ArrayList<Employee>();
	Scanner sc=new Scanner(System.in);
	public void save(Employee employee) 
	{
		employeeDb.add(employee);	
	}
	
	public Employee fetchEmployeeById(int id) 
	{
		boolean count=false;
		for(Employee e:employeeDb)
		{
		   if(e!=null)
		   {
			   if(e.getId()==id)
			   {
				   count=true;
				   System.out.println("Details of "+id+" Hello,"+e.getId()+" and your Salary is:"+e.getSalary());
				   return e;
			   }
		   }
		}
		return null;
	}
	
	public List<Employee> findAllEmployees(int choice) 
	{
		if(choice==1)
			Collections.sort(employeeDb,new SortNames());
		else if(choice==2)
			Collections.sort(employeeDb,new SortSalary());
		else if(choice==3)
			Collections.sort(employeeDb,new SortID());
		else
			Collections.sort(employeeDb,new SortID());
		return employeeDb;
	}
	
	public void updateEmployee(int id, Employee employees) 
	{
		//List<Employee> emp=findAllEmployees();
		for(Employee eobj:employeeDb)
		{
			if(eobj.getId()==id)
			{
				eobj=employees;
				break;
			}
		}
	}
	
}