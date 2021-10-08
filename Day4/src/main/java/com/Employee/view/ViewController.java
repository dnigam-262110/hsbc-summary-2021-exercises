package com.Employee.view;
import java.util.Scanner;
import com.Employee.beans.Employee;
import com.Employee.service.EmployeeServiceInterface;
import com.Employee.service.EmployeeServiceImpl;

public class ViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeServiceInterface service = new EmployeeServiceImpl();
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
				service.store(emp);
				System.out.println("Successfully stored.....");
				System.out.println("---------------------------------");
				break;
			case 2: 
				System.out.println("Enter Id to search:");
				int id=scan.nextInt();
				Employee employee = service.findEmployee(id);
				break;
			case 3: 
				Employee[] employees = service.findAllEmployees();
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
				service.updateSalary(id1, salary);
				break;
			case 5: 
				System.out.println("Enter Id to update name:");
				int id2=scan.nextInt();
				System.out.println("Enter new Name:");
				String name=scan.next();
				service.updateName(id2, name);
				break;
			}
		} while(controllerOption != 0);
		scan.close();
	}
	
}