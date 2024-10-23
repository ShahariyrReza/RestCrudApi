package com.shahariyr.RestCrudApi.dao;

import java.util.List;

import com.shahariyr.RestCrudApi.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findall();
	
	Employee findById(int theId);
	
	Employee savEmployee(Employee thEmployee);
	
	void deleteEmployee(int theId);
	
}
