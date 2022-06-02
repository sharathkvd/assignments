package department.exception;


@SuppressWarnings("serial")
public class MyCustomExeception  extends RuntimeException{
	MyCustomExeception(String exceptionmessage) {

		super(String.format("username %s not found . ",exceptionmessage));

	}


}
