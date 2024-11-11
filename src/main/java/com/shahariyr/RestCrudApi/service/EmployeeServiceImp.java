package com.shahariyr.RestCrudApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.shahariyr.RestCrudApi.Dao.EmployeeRepo;
import com.shahariyr.RestCrudApi.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	
	
	//Constructor Injection of employeeDao
	private EmployeeRepo employeeRepo; // ekhn e ami EmployeeDao k "employeeDao" hisebe niyesi.. so niche return korte hobe ei akare
	
	public EmployeeServiceImp(EmployeeRepo theEmployeeRepo) {
		this.employeeRepo = theEmployeeRepo;
	}
	
	
	@Override
	public List<Employee> findall() {
		return employeeRepo.findAll();
	}

	// No Transaction annotation because this method didn't modify the database.
	@Override
	public Optional<Employee> findById(int theId) {		
		return employeeRepo.findById(theId);
	}


	@Override
	public Employee savEmployee(Employee thEmployee) {
		
		return employeeRepo.save(thEmployee);
	}


	@Override
	public void deleteEmployee(int theId) {
		employeeRepo.deleteById(theId);
		
	}

	
}
