package com.app.cust;

import java.time.LocalDate;

public class Customer {
	 //id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)

	private int customer;
	private String fname,lname,email,password;
	private double regAmt;
	private LocalDate dob;
	private ServicePlan plan;
	private static int id;
	static {
		id=1090;
	}
	
	public Customer(String fname, String lname, String email, String password, double regAmt, LocalDate dob,
			ServicePlan plan) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.dob = dob;
		this.plan = plan;
		this.customer=id++;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getCustomer() {
		return customer;
	}

	public double getRegAmt() {
		return regAmt;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	@Override
	public String toString() {
		return "Customer [customer=" + customer + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", regAmt=" + regAmt + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in cust eq");
		if (o instanceof Customer)
				return (this.email.equals(((Customer)o).email));
		return false;

	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	
	
	 
	
	
}
