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
	public final ResponseEntity<ErrorResponse> exceptionNotFoundHandler(NotFoundException ex){
		
		ErrorResponse error = ErrorResponse.builder()
								.code(HttpStatus.NOT_FOUND.value())
								.msg(ex.getMessage())
								.build();			
		return new ResponseEntity<>(error, new HttpHeaders(),HttpStatus.NOT_FOUND);
	}
	
	
	
	@ExceptionHandler(DuplicateException.class)
	public final ResponseEntity<ErrorResponse> exceptionDuplicateHandler(DuplicateException ex){
		
		ErrorResponse error = ErrorResponse.builder()
								.code(HttpStatus.CONFLICT.value())
								.msg(ex.getMessage())
								.build();			
		return new ResponseEntity<>(error, new HttpHeaders(),HttpStatus.CONFLICT);
	}
}
