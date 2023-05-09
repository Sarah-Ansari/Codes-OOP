package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.myorg.Employee;

public interface IOUtils {
	//store in file
	static void storeInFile(String fileName,HashMap<String, Employee> list) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(list);
		}
	}
	
	//restore in file
	@SuppressWarnings("unchecked")
	static HashMap<String,Employee> restoreInFile(String fileName) {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName))){
			return (HashMap<String, Employee>)in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return new HashMap<String, Employee>();
		}
	
	}
}
