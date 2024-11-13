package com.shahariyr.RestCrudApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shahariyr.RestCrudApi.entity.Employee;

@RepositoryRestResource(path = "employees")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
