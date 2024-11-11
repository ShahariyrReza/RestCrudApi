package com.shahariyr.RestCrudApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahariyr.RestCrudApi.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	// No need any method declaration;
	// No need any implementation class:
}
