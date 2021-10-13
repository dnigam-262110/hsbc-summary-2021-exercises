package com.day6.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.day6.beans.Employee;
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
	
	public List<Employee> findAllEmployees() 
	{
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