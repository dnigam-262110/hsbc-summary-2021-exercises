package com.Employee.service;
import com.Employee.beans.Employee;
import com.Employee.dao.EmployeeDAOInterface;
import com.Employee.dao.EmployeeDaoArrayImpl;
import com.Employee.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeServiceInterface{
	private EmployeeDAOInterface dao = null;
	public EmployeeServiceImpl() 
	{
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoArrayImpl();
	}
	public void store(Employee employee) 
	{
		dao.save(employee);
	}

	
	public Employee findEmployee(int id) throws EmployeeNotFoundException
	{
		Employee emp=dao.fetchEmployeeById(id);
		if(emp==null)
		{
			throw new EmployeeNotFoundException("Employee with an id" +id+" not found");
		}
		return emp;
	}


	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}


	public void updateSalary(int id, double salary) throws EmployeeNotFoundException
	{
		System.out.println("------Previous salary details:");
		Employee eobj=dao.fetchEmployeeById(id);
		if(eobj!=null)
		{
			eobj.setSalary(salary);
			dao.updateEmployee(id, eobj);
			System.out.println("----Salary Updated----");
		}
		else
		{
			throw new EmployeeNotFoundException("Employee with an id" +id+" not found");
			
		}
	}
	public void updateName(int id, String name) throws EmployeeNotFoundException
	{
		System.out.println("-------Previous Name details:");
		Employee eobj=dao.fetchEmployeeById(id);
		if(eobj!=null)
		{
			eobj.setName(name);
			dao.updateEmployee(id, eobj);
			System.out.println("----Name Updated----");
		}
		else
		{
			throw new EmployeeNotFoundException("Employee with an id" +id+" not found");
		}
	}

}