package com.acn.nemo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(NotFoundException.class)
	public final ResponseEntity<ErrorResponse> exceptionNotFoundHandler(Exception ex){
		
		ErrorResponse error = new ErrorResponse();
		error.setCode(HttpStatus.NOT_FOUND.value());
		error.setMsg(ex.getMessage());
			
		return new ResponseEntity<>(error, new HttpHeaders(),HttpStatus.NOT_FOUND);
	}
	
	
	
	@ExceptionHandler(DuplicateException.class)
	public final ResponseEntity<ErrorResponse> exceptionDuplicateHandler(Exception ex){
		
		ErrorResponse error = new ErrorResponse();
		error.setCode(HttpStatus.CONFLICT.value());
		error.setMsg( ((DuplicateException) ex ).getMessage());
			
		return new ResponseEntity<>(error, new HttpHeaders(),HttpStatus.CONFLICT);
	}
}
