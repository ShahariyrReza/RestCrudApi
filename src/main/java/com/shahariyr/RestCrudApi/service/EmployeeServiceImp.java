package com.shahariyr.RestCrudApi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shahariyr.RestCrudApi.dao.EmployeeDAO;
import com.shahariyr.RestCrudApi.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	
	
	//Constructor Injection of employeeDao
	private EmployeeDAO employeeDAO; // ekhn e ami EmployeeDao k "employeeDao" hisebe niyesi.. so niche return korte hobe ei akare
	
	public EmployeeServiceImp(EmployeeDAO thEmployeeDAO) {
		this.employeeDAO = thEmployeeDAO;
	}
	
	
	@Override
	public List<Employee> findall() {
		return employeeDAO.findall();
	}


	@Override
	public Employee findById(int theId) {
		
		return employeeDAO.findById(theId);
	}


	@Transactional
	@Override
	public Employee savEmployee(Employee thEmployee) {
		
		return employeeDAO.savEmployee(thEmployee);
	}


	@Transactional
	@Override
	public void deleteEmployee(int theId) {
		employeeDAO.deleteEmployee(theId);
		
	}

	
}
