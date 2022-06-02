package department.globalexception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import department.exception.MyCustomExeception;


@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(MyCustomExeception.class)
	ResponseEntity<Object> messageHandledModules(MyCustomExeception ex) {

		Map<String, String> body = new LinkedHashMap<>();
		body.put("message", ex.getMessage());

		return new ResponseEntity<>(body, HttpStatus.OK);

	}


}
