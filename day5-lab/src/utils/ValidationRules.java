package utils;

import java.util.List;

import com.app.cust.Customer;
import com.app.cust.ServicePlan;
import static com.app.cust.ServicePlan.*;

import exceptionHandler.CustomerExpHandler;

public class ValidationRules {
	/*
	 * no dup customers Hint : public static void checkForDup(....) { api : contains
	 * }
	 * 
	 * validate plan reg amount must match with the plan customer's age must be > 21
	 * : lab work
	 */
	
	public static void checkForDuplicate(String email,List<Customer> customerList) throws CustomerExpHandler {
		System.out.println("in cust vali");
		Customer customer=new Customer (email);
		if(customerList.contains(customer))
			throw new CustomerExpHandler("user exists");
		System.out.println("no such user");
	}
	
	public static void plan(String plan) throws CustomerExpHandler {
		for(ServicePlan e: values()) {
			if(e.name()!=plan)
				throw new CustomerExpHandler("Invalid plan");
		}
		
		
		
				
			
		
		
	}
	
}
