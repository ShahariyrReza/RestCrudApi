package com.shahariyr.RestCrudApi.service;

import java.util.List;
import java.util.Optional;

import com.shahariyr.RestCrudApi.entity.Employee;

public interface EmployeeService {

	List<Employee> findall();
	
	Optional<Employee> findById(int theId);
	
	Employee savEmployee(Employee thEmployee);
	
	void deleteEmployee(int theId);
}
