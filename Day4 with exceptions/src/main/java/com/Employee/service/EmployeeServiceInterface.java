package com.Employee.service;

import com.Employee.beans.Employee;
import com.Employee.exceptions.EmployeeNotFoundException;

public interface EmployeeServiceInterface
{
	public void store(Employee employee);
	public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException;
	public void updateName(int id, String name)throws EmployeeNotFoundException;;
}