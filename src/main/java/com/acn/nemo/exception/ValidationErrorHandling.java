package com.acn.nemo.exception;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValidationErrorHandling {

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	ValidationErrorResponse onConstraintValidationException(ConstraintViolationException e) {
		ValidationErrorResponse error = ValidationErrorResponse.builder().build();
		for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
			error.getViolations().add(new Validation(violation.getPropertyPath().toString(), violation.getMessage()));
		}
		return error;
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	ValidationErrorResponse onMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		ValidationErrorResponse error = ValidationErrorResponse.builder().build();
		for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
			error.getViolations().add(new Validation(fieldError.getField(), fieldError.getDefaultMessage()));
		}
		return error;
	}
	
//	@ExceptionHandler(NoSuchElementException.class)
////	@ResponseStatus(HttpStatus.NOT_FOUND)
////	@ResponseBody
//	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e){
//		return new ResponseEntity<String>("Input field not present", HttpStatus.NOT_FOUND);
//		
//	}
	

}
