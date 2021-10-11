package com.Employee.dao;
import com.Employee.beans.Employee;
public interface EmployeeDAOInterface 
{
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateEmployee(int id, Employee employee);

}