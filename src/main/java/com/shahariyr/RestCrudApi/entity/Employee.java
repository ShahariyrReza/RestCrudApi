package com.shahariyr.RestCrudApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	// no argument constructor
	public Employee() {
		
	}

	// all argument constructor
	public Employee(int id, String firstname, String lastName, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
	}

	// getter setter method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	// to string method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
