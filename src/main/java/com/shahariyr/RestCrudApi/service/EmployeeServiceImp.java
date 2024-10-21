package com.shahariyr.RestCrudApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shahariyr.RestCrudApi.dao.EmployeeDAO;
import com.shahariyr.RestCrudApi.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	
	
	//Constructor Injection of employeeDao
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImp(EmployeeDAO thEmployeeDAO) {
		this.employeeDAO = thEmployeeDAO;
	}
	
	
	@Override
	public List<Employee> findall() {
		return employeeDAO.findall();
	}

	
}
