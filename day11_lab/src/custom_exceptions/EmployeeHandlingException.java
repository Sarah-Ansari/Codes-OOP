package custom_exceptions;

@SuppressWarnings("serial")
public class EmployeeHandlingException extends Exception {
	public EmployeeHandlingException(String mesg) {
		super(mesg);
	}

}
