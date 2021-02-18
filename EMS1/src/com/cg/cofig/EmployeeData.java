package com.cg.cofig;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeData {
	
	private static List<Employee> empList;
	
	static {
		empList=new ArrayList<Employee>();
		empList.add(new Employee(101, "Rahul", 34000, "Java"));
		empList.add(new Employee(102, "Umar", 54000, "Oracle"));
		empList.add(new Employee(103, "Vidya", 64000, "Spring"));
		empList.add(new Employee(104, "Roosa", 54000, "BFSI"));
	}
	
	public static List<Employee> getEmpList(){
		return empList;
	}
}
