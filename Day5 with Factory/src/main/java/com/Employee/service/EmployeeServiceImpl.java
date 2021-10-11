package com.Employee.service;
import com.Employee.beans.Employee;
import com.Employee.dao.EmployeeDAOInterface;
import com.Employee.exceptions.EmployeeAlreadyExistException;
import com.Employee.exceptions.EmployeeNotFoundException;
import com.Employee.factory.Factories;

public class EmployeeServiceImpl implements EmployeeServiceInterface
{
	private EmployeeDAOInterface dao = null;
	public EmployeeServiceImpl() 
	{
		Factories fact=new Factories();
		dao = fact.createDAOObject();
	}
	public void store(Employee employee) throws EmployeeAlreadyExistException
	{
		Employee[] emp=dao.findAllEmployees();
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