package com.Employee.dao;
import java.util.Scanner;

import com.Employee.beans.Employee;
public class EmployeeDaoArrayImpl implements EmployeeDAOInterface 
{
	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;
	Scanner sc=new Scanner(System.in);
	public void save(Employee employee) 
	{
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}
	
	public Employee fetchEmployeeById(int id) 
	{
		boolean count=false;
		for(int i=0;i<employeeDb.length;i++)
		{
		   if(employeeDb[i]!=null)
		   {
			   if(employeeDb[i].getId()==id)
			   {
				   count=true;
				   System.out.println("Details of "+id+" Hello,"+employeeDb[i].getName()+" and your Salary is:"+employeeDb[i].getSalary());
				   return employeeDb[i];
			   }
		   }
		}
		if(count==false)
		{
			System.out.println("Id not found");
		}
		return null;
	}
	
	public Employee[] findAllEmployees() 
	{
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for(int index = 0; index < arrayIndexCounter; index++) 
		{
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}
	
	public void updateSalary(int id, double salary) 
	{
		boolean count=false;
		for(int i=0;i<employeeDb.length;i++)
		{
		   if(employeeDb[i]!=null)
		   {
			   if(employeeDb[i].getId()==id)
			   {
				   count=true;
				  employeeDb[i].setSalary(salary);
				  System.out.println("Salary Updated");
			   }
		   }
		}
		if(count==false)
		{
			System.out.println("Id not found");
		}
	}

	public void updateName(int id, String name) 
	{
		boolean count=false;
		for(int i=0;i<employeeDb.length;i++)
		{
		   if(employeeDb[i]!=null)
		   {
			   if(employeeDb[i].getId()==id)
			   {
				   count=true;
				  employeeDb[i].setName(name);
				  System.out.println("Name Updated");
			   }
		   }
		}
		if(count==false)
		{
			System.out.println("Id not found");
		}
	}
}