package com.day6.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.day6.beans.Employee;
import com.day6.utility.DBConnection;


public class EmployeeDaojdbcImpl implements EmployeeDaoInterface 
{

	public void save(Employee employee) {
		try {
			Connection connection = DBConnection.establishConnection();
			String insertQuery = "insert into EmployeeData(name, id, salary) values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, employee.getName());
			statement.setInt(2, employee.getId());
			statement.setDouble(3, employee.getSalary());
			statement.executeUpdate();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}


	public Employee fetchEmployeeById(int id) {
		Employee employee = null;
		try {
			Connection connection = DBConnection.establishConnection();
			String selectQuery = "select * from EmployeeData where id = ?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				employee = new Employee(); // id, name & salary will have default values
				employee.setName(result.getString(1));
				employee.setId(result.getInt(2)); 
				employee.setSalary(result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	public Collection<Employee> findAllEmployees(int choice) 
	{
		Collection<Employee> employees = null;
		try {
			Connection connection = DBConnection.establishConnection();
			String selectQuery = "select * from EmployeeData";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			ResultSet result = statement.executeQuery();
			List<Employee> employeesList = new ArrayList<Employee>();
			while(result.next()) {
				Employee employee = new Employee(); // id, name & salary will have default values 
				employee.setName(result.getString(1)); 
				employee.setId(result.getInt(2));
				employee.setSalary(result.getDouble(3)); 
				employeesList.add(employee);
			}
			employees = employeesList;
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public void updateEmployee(int id, Employee employee) 
	{
		Connection connection;
		try
		{
			connection = DBConnection.establishConnection();
		PreparedStatement ps=connection.prepareStatement("update EmployeeData set name=? and salary=? where id=?");
		ps.setString(1, employee.getName());
		ps.setInt(2,id);
		ps.setDouble(3,employee.getSalary());
		ps.executeUpdate();
		ps.close();
		connection.close();
	    }
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}