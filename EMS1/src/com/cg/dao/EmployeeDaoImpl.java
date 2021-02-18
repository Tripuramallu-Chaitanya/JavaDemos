package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.cofig.EmployeeData;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> displayAllEmployee() {
		return EmployeeData.getEmpList();
	}

	@Override
	public String createEmployee(Employee emp) {
		EmployeeData.getEmpList().add(emp);
		return "Employee Added!";
	}

	@Override
	public Employee findEmployee(int empid) {
		List <Employee> emp = EmployeeData.getEmpList();
		for(Employee e:emp) {
			if (empid == e.getEmpid()) {
				return e;
			}
				
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int empid) {
		List <Employee> emp = EmployeeData.getEmpList();
		for (Employee e:emp) {
			if (empid == e.getEmpid()) {
				emp.remove(e);
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee updateSalary(int empid,double salary) {
		List <Employee> emp=EmployeeData.getEmpList();
		for(Employee e:emp) {
			if (empid == e.getEmpid()) {
				e.setSalary(salary);
				return e;
			}
		}
		return null;
	}

}
