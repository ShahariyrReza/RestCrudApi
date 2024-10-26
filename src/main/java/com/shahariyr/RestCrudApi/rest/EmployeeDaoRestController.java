package com.shahariyr.RestCrudApi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	// find all employee
	@GetMapping("/employees")
	public List<Employee> findEmployees() {

		return employeeService.findall();
	}

	// find specific employee
	@GetMapping("/employees/{employeeID}") // "{employeeID}" and after @pathvariable "employeeID" must be same

	public Employee getSingleEmployee(@PathVariable int employeeID) {

		Employee theEmployee = employeeService.findById(employeeID);

		if (theEmployee == null) {
			throw new RuntimeException("Employee not found which ID is :" + employeeID);
		}

		return theEmployee;
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee thEmployee) {

		thEmployee.setId(0);
		Employee theEmployee = employeeService.savEmployee(thEmployee);
		return theEmployee;

	}

	// update employee
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {

		Employee dbEmployee = employeeService.savEmployee(employee);

		return dbEmployee;
	}

	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {

		Employee tempEmployee = employeeService.findById(employeeId);

		if (tempEmployee == null) {
			throw new RuntimeException("Employee id not found..." + employeeId);
		}

		employeeService.deleteEmployee(employeeId);

		return "Employee is deleted of id :" + employeeId;
	}

}
