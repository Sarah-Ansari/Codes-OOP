package tester;

import static utils.EmpValidationRules.validaetAllInputs;
import static utils.IOUtils.*;

import java.util.HashMap;
import java.util.Scanner;

import com.myorg.Employee;

import custom_exceptions.EmployeeHandlingException;

public class Testemp {

	public static void main(String[] args) throws EmployeeHandlingException {
		//restore file 1st
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("enter file name");
		String filename=sc.nextLine();
		HashMap<String,Employee> empMap = restoreInFile(filename);
		empMap.put("as120",validaetAllInputs("as120","sd","sd","hr","2020-03-01",120000,empMap) );
		//empMap.values().forEach(v->System.out.println(v));
		empMap.forEach((k,v)->System.out.println(v));
		boolean exit=false;
		try {
			while(!exit) {
				System.out.println("Options:");
				System.out.println("choose:");
			switch(sc.nextInt()) {
			case 0:
				exit=true;
				storeInFile(filename, empMap);
				break;
			}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}
		
		
		
		}
	}

}
