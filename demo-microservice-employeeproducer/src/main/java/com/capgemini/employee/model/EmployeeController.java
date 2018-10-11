package com.capgemini.employee.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee.model.Employee;

@RestController

public class EmployeeController {

	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public Employee firstPage() {
		Employee emp= new Employee();
		emp.setName("Akash");
		emp.setDesignation("controller");
		emp.setEmpId("123");
		emp.setSalary(12000);
		return emp;
	}
}
