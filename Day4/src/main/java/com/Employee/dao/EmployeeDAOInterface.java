package com.Employee.dao;
import com.Employee.beans.Employee;
public interface EmployeeDAOInterface 
{
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary);
	public void updateName(int id, String name);

}