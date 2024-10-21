package com.shahariyr.RestCrudApi.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahariyr.RestCrudApi.dao.EmployeeDAO;
import com.shahariyr.RestCrudApi.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeDaoRestController {

	
	///Constructor Injection
	private EmployeeDAO employeeDAO;

	public EmployeeDaoRestController(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	
	@GetMapping("/employees")
	public List<Employee> findEmployees() {
		
		return employeeDAO.findall();
	}

}
