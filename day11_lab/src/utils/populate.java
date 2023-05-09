package utils;

import java.util.HashMap;
import java.util.Map;
import static utils.EmpValidationRules.*;
import com.myorg.Employee;

import custom_exceptions.EmployeeHandlingException;

public interface populate {
	static Map<String, Employee> populatedlist() throws EmployeeHandlingException{
		Map<String, Employee> list=new HashMap<String, Employee>();
		list.putIfAbsent("as120",validaetAllInputs("as120","sd","sd","hr","2020-03-01",120000,list) );
		return list;
		
	}

	

}
