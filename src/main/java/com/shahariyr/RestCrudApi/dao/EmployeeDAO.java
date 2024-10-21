package com.shahariyr.RestCrudApi.dao;

import java.util.List;

import com.shahariyr.RestCrudApi.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findall();
}
