package com.cg.bean;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private String domain;
	
	public Employee() {
		
	}	
	public Employee(int empid, String name, double salary, String domain) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.domain = domain;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public String toString() {
		return empid+"\t"+name+"\t"+salary+"\t"+domain;
	}

}

