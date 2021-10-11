package com.Employee.dao;
import com.Employee.beans.Employee;
import com.Employee.exceptions.EmployeeAlreadyExistException;
public interface EmployeeDAOInterface 
{
	public void save(Employee employee) throws EmployeeAlreadyExistException;
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateEmployee(int id, Employee employee);

}