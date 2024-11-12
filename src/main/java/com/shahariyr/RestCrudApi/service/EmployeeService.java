package com.shahariyr.RestCrudApi.service;

import java.util.List;

import com.shahariyr.RestCrudApi.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee savEmployee(Employee thEmployee);

	void deleteEmployee(int theId);
}
