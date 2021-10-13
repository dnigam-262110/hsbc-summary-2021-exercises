package com.day6.view;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.day6.beans.Employee;
import com.day6.dao.EmployeeDaoInterface;
import com.day6.exceptions.EmployeeAlreadyExistException;
import com.day6.exceptions.EmployeeNotFoundException;
import com.day6.factory.Factories;
import com.day6.service.EmployeeServiceInterface;

public class ViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter \n1.To getArrayListImpl \n2.To getTreeSetImpl");
		int choice=scan.nextInt();
		EmployeeDaoInterface empDao=Factories.createDAOObject(choice);
		EmployeeServiceInterface service = Factories.createServiceObject(empDao);
		int controllerOption = 0;
		do {

			System.out.println("----Employee Menu----");
			System.out.println("\n0: Exit\n 1: Store employee\n 2: Find employee by id\n 3: Find All employees\n 4: Update Salary\n 5: Update Name");
			System.out.println("Enter options:-");
			controllerOption = scan.nextInt();
			switch(controllerOption) 
			{
			case 0:
				System.exit(0);
				break;
			case 1: 
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				try {
					service.store(emp);
					System.out.println("Successfully stored.....");
					System.out.println("---------------------------------");
				    } 
				catch (EmployeeAlreadyExistException ex)
				{
					System.err.println(ex.getMessage());
				}
				break;
			case 2: 
				System.out.println("Enter Id to search:");
				int id=scan.nextInt();
				Employee employee;
				try {
					employee = service.findEmployee(id);
				    } 
				catch (EmployeeNotFoundException ex1) 
				    {
					System.err.println(ex1.getMessage());
				    }
				break;
			case 3: 
				Collection<Employee> employees = service.findAllEmployees();
				System.out.println("----Employee Details-----");
				for(Employee e : employees) 
				{
					System.out.println("Hello "+e.getName()+", Your salary is: "+e.getSalary()+" and id is : "+e.getId());
				}
				break;
			case 4: 
				System.out.println("Enter Id to update salary:");
				int id1=scan.nextInt();
				System.out.println("Enter new salary:");
				double salary=scan.nextDouble();
	
				try {
					service.updateSalary(id1, salary);
				    } 
				catch (EmployeeNotFoundException ex2) 
				   {
					System.err.println(ex2.getMessage());
				   }
				break;
			case 5: 
				System.out.println("Enter Id to update name:");
				int id2=scan.nextInt();
				System.out.println("Enter new Name:");
				String name=scan.next();
				
				try {
					service.updateName(id2, name);
				    } 
				catch (EmployeeNotFoundException ex3) 
				   {
					System.err.println(ex3.getMessage());
				   }
				break;
			}
		} while(controllerOption != 0);
		scan.close();
	}
	
}