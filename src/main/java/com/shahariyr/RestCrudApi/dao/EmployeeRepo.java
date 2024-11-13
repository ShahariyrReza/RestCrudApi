package com.shahariyr.RestCrudApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahariyr.RestCrudApi.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
