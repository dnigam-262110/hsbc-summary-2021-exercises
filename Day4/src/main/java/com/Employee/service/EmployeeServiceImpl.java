package com.Employee.service;
import com.Employee.beans.Employee;
import com.Employee.dao.EmployeeDAOInterface;
import com.Employee.dao.EmployeeDaoArrayImpl;

public class EmployeeServiceImpl implements EmployeeServiceInterface{
	private EmployeeDAOInterface dao = null;
	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoArrayImpl();
	}


	public void store(Employee employee) {
		dao.save(employee);
	}

	
	public Employee findEmployee(int id) 
	{
		
		return  dao.fetchEmployeeById(id);
	}


	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}


	public void updateSalary(int id, double salary) 
	{
		dao.updateSalary(id, salary);
	}
	public void updateName(int id, String name) 
	{
			dao.updateName(id, name);
	}

}