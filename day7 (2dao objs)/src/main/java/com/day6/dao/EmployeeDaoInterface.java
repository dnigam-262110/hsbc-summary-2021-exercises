package com.day6.dao;
import java.util.Collection;
import com.day6.beans.Employee;
public interface EmployeeDaoInterface 
{
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Collection<Employee>findAllEmployees();
	public void updateEmployee(int id, Employee employee);

}