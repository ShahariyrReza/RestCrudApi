package com.shahariyr.RestCrudApi.dao;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.shahariyr.RestCrudApi.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDaoImp implements EmployeeDAO {

	
	private EntityManager entityManager;

//	@Autowired
	public EmployeeDaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	// method for find all employee.
	@Override
	public List<Employee> findall() {
		
		// Create Query
		TypedQuery<Employee> theQuery = entityManager.createQuery(" from Employee", Employee.class); // basic jpa query. mukustw kore rakhte hoe ata...

		// Execute and get result from query
		List<Employee> employees = theQuery.getResultList();

		// return result
		return employees;
	}

	
	//method for find employee by their id..
	@Override
	public Employee findById(int theId) {
		//take the id
		
		Employee theEmployee = entityManager.find(Employee.class, theId);
		
		return theEmployee;
	}

	
	// method for save the employee..
	@Override
	public Employee savEmployee(Employee thEmployee) {
		Employee dbEmployee = entityManager.merge(thEmployee);
		return dbEmployee;
	}

	
	// method for delete the employee
	@Override
	public void deleteEmployee(int theId) {
		
		Employee theEmployee = entityManager.find(Employee.class, theId);
		
		entityManager.remove(theEmployee);
	}

}










