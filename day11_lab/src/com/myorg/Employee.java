package com.myorg;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Emp details : id(string), first name , last name , 
 * dept(enum : RND,HR,SALES,FINANCE,PRODUCTION), joining date(LocalDate)
 * ,salary
 */
public class Employee implements Serializable {
	private String id;
	private String firstName;
	private String lastName;
	private Department dept;
	private LocalDate joinDate;
	private double salary;
	public Employee(String id, String firstName, String lastName, Department dept, LocalDate joinDate, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", joinDate=" + joinDate + ", salary=" + salary + "]";
	}
	

}
