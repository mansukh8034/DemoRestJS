package com.mbp.demorestjs.bean;


import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeDAO() {
	
		Employee emp = new Employee();
		emp.setEmpID(200);
		emp.setEmpName("ASDFGH YUITRE");
		emp.setEmpTitle("Associate Director");
		emp.setSalary(50000);
	
		Employee emp2 = new Employee();
		emp2.setEmpID(300);
		emp2.setEmpName("Whatis");
		emp2.setEmpTitle("AVP");
		emp2.setSalary(80000);
	
		Employee emp1 = new Employee();
		emp1.setEmpID(100);
		emp1.setEmpName("Hello 100");
		emp1.setEmpTitle("MD");
		emp1.setSalary(105000);
		
		//empList = Arrays.asList(emp, emp2, emp1);
		empList.add(emp);
		empList.add(emp2);
		empList.add(emp1);
		
		System.out.println("----------------------Creating List------------");
		
   }
	
   public List<Employee> getAllEmployee(){
	   return this.empList;
   }
   
   public Employee getEmpByID(int empid) {
	   
	   Employee emp = null;
	   
	   for(Employee a : empList) {
		   if(a.getEmpID() == empid) {
			   return a;
		   }
	   }
	   
	   return emp;
   }

   public void createEmp(Employee e1) {
	  System.out.println("in     save");
	   this.empList.add(e1);
	   System.out.println("after save     save :: " + empList.size());  
	
   }
}
