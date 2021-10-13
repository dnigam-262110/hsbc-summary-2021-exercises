package com.day6.factory;
import java.util.Comparator;
import com.day6.beans.Employee;

public class SortID implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2) 
	{
		return (e1.getId() - e2.getId());
	}
}
