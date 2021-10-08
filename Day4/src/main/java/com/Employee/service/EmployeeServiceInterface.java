package com.Employee.service;

import com.Employee.beans.Employee;

public interface EmployeeServiceInterface
{
	public void store(Employee employee);
	public Employee findEmployee(int id);
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary);
	public void updateName(int id, String name);
}