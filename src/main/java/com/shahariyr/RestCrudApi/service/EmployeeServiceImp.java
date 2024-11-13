package com.shahariyr.RestCrudApi.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.shahariyr.RestCrudApi.Dao.EmployeeRepo;
import com.shahariyr.RestCrudApi.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	// Constructor Injection of employeeRepo
	private EmployeeRepo employeeRepo; // EmployeeRepo="employeeRepo". always used employeeRepo.

	public EmployeeServiceImp(EmployeeRepo theEmployeeRepo) {
		this.employeeRepo = theEmployeeRepo;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	// No Transaction annotation because this method didn't modify the database.
	@Override
	public Employee findById(int theId) {

		Optional<Employee> result = employeeRepo.findById(theId);

		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();

		}

		else {
			throw new RuntimeException("Didn't find the id :" + theId);
		}
		return theEmployee;

	}

	@Override
	public Employee savEmployee(Employee thEmployee) {

		Employee savedEmployee = employeeRepo.save(thEmployee);
		return savedEmployee;
	}

	@Override
	public void deleteEmployee(int theId) {
		employeeRepo.deleteById(theId);

	}

}
