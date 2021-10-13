package com.day6.factory;
import java.util.Comparator;

import com.day6.beans.Employee;

public class SortSalary implements Comparator<Employee>
{

	public int compare(Employee o1, Employee o2) 
	{
		return (int) (o1.getSalary()- o2.getSalary());
	}
}
