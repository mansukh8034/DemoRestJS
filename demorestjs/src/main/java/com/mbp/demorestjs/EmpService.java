package com.mbp.demorestjs;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mbp.demorestjs.bean.Employee;
import com.mbp.demorestjs.bean.EmployeeDAO;


@Path("/empsrv")
public class EmpService {
	
	EmployeeDAO emp = new EmployeeDAO();
	
	/*
	 @GET
	@Produces(MediaType.TEXT_PLAIN)
public String getEmpDetail() {
		
		return "sdfsdfsdf";
		
		} */
	
	@GET	
	@Path("/emps")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Employee> getEmpDetail() {
		
		System.out.println(" aaaaaa ");
		
		return emp.getAllEmployee();
		
	} 
	
	@GET
	@Path("/emps/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee getEmpbyID(@PathParam("id") int eid) {
		return emp.getEmpByID(eid);
	}
	
	@POST
	@Path("/emps")
	public Employee createEmp(Employee e1) {
		System.out.println("--------------- ::: "+e1);
		emp.createEmp(e1);
		System.out.println("---------AFTER------ ::: " + emp.getAllEmployee().size());
		return e1;
	}

}
