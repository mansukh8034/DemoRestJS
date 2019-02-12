package com.mbp.demorestjs.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee{

	private int empID;
	private String empName;
	private String empTitle;
	private int salary;
	
	//public Employee() {}
	
	public int getEmpID() {
		return this.empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpTitle() {
		return this.empTitle;
	}

	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empTitle=" + empTitle + ", salary=" + salary
				+ "]";
	}*/

	
	
	
	
}
