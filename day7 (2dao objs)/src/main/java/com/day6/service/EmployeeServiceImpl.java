package com.day6.service;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.day6.beans.Employee;
import com.day6.dao.EmployeeDaoInterface;
import com.day6.exceptions.EmployeeAlreadyExistException;
import com.day6.exceptions.EmployeeNotFoundException;
import com.day6.factory.Factories;

public class EmployeeServiceImpl implements EmployeeServiceInterface
{
	private EmployeeDaoInterface dao;
	public EmployeeServiceImpl(EmployeeDaoInterface dao) 
	{
		this.dao=dao;
	}
	public void store(Employee employee) throws EmployeeAlreadyExistException
	{
		Collection<Employee> emp=dao.findAllEmployees();
		for(Employee eobj:emp)
		{
			if(eobj.getId()==employee.getId())
			{
				throw new EmployeeAlreadyExistException("Employee ID Already Exists"); 
			}
		}
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


	public Collection<Employee> findAllEmployees() {
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