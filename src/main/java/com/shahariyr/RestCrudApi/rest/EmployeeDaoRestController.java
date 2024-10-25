package com.shahariyr.RestCrudApi.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shahariyr.RestCrudApi.entity.Employee;
import com.shahariyr.RestCrudApi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeDaoRestController {

	/*
	 * No need this injection. employeeService will handle this from now
	 * ///Constructor Injection private EmployeeDAO employeeDAO;
	 * 
	 * public EmployeeDaoRestController(EmployeeDAO employeeDAO) { this.employeeDAO
	 * = employeeDAO; }
	 */

	private EmployeeService employeeService;

	public EmployeeDaoRestController(EmployeeService thEmployeeService) {
		this.employeeService = thEmployeeService;
	}

	//find all employee
	@GetMapping("/employees")
	public List<Employee> findEmployees() {

		return employeeService.findall();
	}

	//find specific employee
	@GetMapping("/employees/{employeeID}") // "{employeeID}" and after @pathvariable "employeeID" must be same
										
	public Employee getSingleEmployee(@PathVariable int employeeID) {

		Employee theEmployee = employeeService.findById(employeeID);

		if (theEmployee == null) {
			throw new RuntimeException("Employee not found which ID is :" + employeeID);
		}

		return theEmployee;
	}
	
	

}
