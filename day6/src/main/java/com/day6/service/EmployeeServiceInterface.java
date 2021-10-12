package com.day6.service;
import java.util.Collection;

import com.day6.beans.Employee;
import com.day6.exceptions.EmployeeAlreadyExistException;
import com.day6.exceptions.EmployeeNotFoundException;

public interface EmployeeServiceInterface
{
	public void store(Employee employee)throws EmployeeAlreadyExistException;
	public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public Collection<Employee> findAllEmployees();
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException;
	public void updateName(int id, String name)throws EmployeeNotFoundException;;
}