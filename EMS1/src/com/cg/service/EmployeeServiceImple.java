package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;

public class EmployeeServiceImple implements EmployeeService {
	
	EmployeeDao eDao=new EmployeeDaoImpl();
	@Override
	public List<Employee> printAllEmployee() {
		
		return eDao.displayAllEmployee();
	}

	@Override
	public String register(Employee e) {
		boolean b=false;
		if(e.getName().isEmpty() || e.getSalary()<0 ||e.getDomain().isEmpty())
			return "Invalid Data!";
		else {
			for(Employee emp:eDao.displayAllEmployee()) {
				if (emp.getEmpid()==e.getEmpid()) {
					b=true;
					break;
				}
			}
		}
		if (b) 
			return "Employee is already available";
		else
			return eDao.createEmployee(e);
				
		
	}

	@Override
	public Employee finding(int a) {
		return eDao.findEmployee(a);
	}

	@Override
	public Employee deletion(int a) {
		return eDao.deleteEmployee(a);
	}

	@Override
	public Employee updation(int a, double b) {
		return eDao.updateSalary(a, b);
	}

}
