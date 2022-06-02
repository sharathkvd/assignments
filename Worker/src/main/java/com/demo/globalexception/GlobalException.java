package com.demo.globalexception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.exeception.MyCustomException;



@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler{
	@ExceptionHandler(MyCustomException.class)
	ResponseEntity<Object> messageHandledModules(MyCustomException ex) {

		Map<String, String> body = new LinkedHashMap<>();
		body.put("message", ex.getMessage());

		return new ResponseEntity<>(body, HttpStatus.OK);

	}

}
