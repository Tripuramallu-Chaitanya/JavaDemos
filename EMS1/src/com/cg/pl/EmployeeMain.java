package com.cg.pl;

import java.util.Scanner;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImple;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService eService=new EmployeeServiceImple();
		Scanner sc=new Scanner(System.in);
		String ch="Yes";
		while(ch.equalsIgnoreCase("yes")) {
			System.out.println("Press 1 for display All Employee");
			System.out.println("Press 2 for  New Employee");
			System.out.println("press 3 for finding employee through ID: ");
			System.out.println("press 4 for deleting employee through ID: ");
			System.out.println("press 5 for updating employee through ID: ");
			System.out.println("Enter Choice...");
			int c=sc.nextInt();
			switch(c) {
				case 1:  
					for(Employee e:eService.printAllEmployee())
								System.out.println(e);
					break;
				case 2:
						System.out.println("Enter Employee ID:");
						int eid=sc.nextInt();
						System.out.println("Enter Employee Name");
						String name=sc.next();
						System.out.println("Enter Employee Salary");
						double sal=sc.nextDouble();
						System.out.println("Enter Employee Domain");
						String domain=sc.next();
						String result=eService.register(new Employee(eid, name, sal, domain));
						System.out.println(result);
						break;
				case 3:
						System.out.println("Enter the employee ID");
						int abc = sc.nextInt();
						if(eService.finding(abc)==null) {
							System.out.println("Doesn't Exists");
						}
						else
							System.out.println(eService.finding(abc));
						break;
				case 4:
					System.out.println("Enter the employee ID");
					int z = sc.nextInt();
					if(eService.deletion(z)==null) {
						System.out.println("Doesn't Exists");
					}
					else
						System.out.println("Successfully Deleted");
					break;
				case 5:
					System.out.println("Enter the employee ID");
					int gh = sc.nextInt();
					double sal1 = sc.nextDouble();
					if(eService.updation(gh,sal1)==null) {
						System.out.println("Doesn't Exists");
					}
					else
						System.out.println("Successfully Updated");
					break;
				default :
					System.out.println("Wrong Choice");
						
			}
			System.out.println("Do You want to continue.....");
			ch=sc.next();
		}
		System.out.println("Exited!!!!!");
	}

}
