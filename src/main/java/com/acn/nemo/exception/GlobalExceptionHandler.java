package com.acn.nemo.exception;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * The Class GlobalExceptionHandler.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	/**
	 * Handle not found exception.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	 public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex) { 
	    List<String> errors = Collections.singletonList(ex.getMessage()); 
	    
	    ErrorResponse errorResponse = ErrorResponse.builder()
				    								.code(HttpStatus.NOT_FOUND.value())
				    								.message(errors)
				    								.build();
	    return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.NOT_FOUND ); 
	} 

	 /**
	 * Handle not found exception.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	 @ExceptionHandler(value = {DuplicateException.class})
	 @ResponseStatus(HttpStatus.CONFLICT)
	 public ResponseEntity<ErrorResponse> handleDuplicateException(DuplicateException ex) { 
	    List<String> errors = Collections.singletonList(ex.getMessage()); 
	    
	    ErrorResponse errorResponse = ErrorResponse.builder()
				    								.code(HttpStatus.NOT_FOUND.value())
				    								.message(errors)
				    								.build();
	    return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.CONFLICT ); 
	} 


	/**
	 * Handle validation errors.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ExceptionHandler(value = {MethodArgumentNotValidException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException ex) {
		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage)
								.collect(Collectors.toList());
		ErrorResponse errorResponse = ErrorResponse.builder()
													.code(HttpStatus.BAD_REQUEST.value())
													.message(errors)
													.build();
		return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(NumberFormatException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorResponse> handleNumberFormatException(NumberFormatException ex) {
		List<String> errors = Arrays.asList(ex.getMessage());
		ErrorResponse errorResponse = ErrorResponse.builder()
													.code(HttpStatus.BAD_REQUEST.value())
													.message(errors)
													.build();
		return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	
	/**
	 * Handle constraint errors.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
//	@ExceptionHandler(ConstraintViolationException.class)
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	public ResponseEntity<ErrorResponse> handleConstraintErrors(ConstraintViolationException ex) {	
//		List<String> errors = ex.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
//		ErrorResponse errorResponse = ErrorResponse.builder()
//													.code(HttpStatus.BAD_REQUEST.value())
//													.message(errors)
//													.build();
//		return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
//	}
	
	
	
	/**
	 * Handle entity not found exception.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ExceptionHandler(EntityNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	protected ResponseEntity<ErrorResponse> handleEntityNotFoundException(EntityNotFoundException ex) {
		List<String> errors = Arrays.asList(ex.getMessage());

	    ErrorResponse errorResponse = ErrorResponse.builder()
				    								.code(HttpStatus.BAD_REQUEST.value())
				    								.message(errors)
				    								.build();
		return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		
	}
	
	/**
	 * Handle general exceptions.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public final ResponseEntity<ErrorResponse> handleGeneralExceptions(Exception ex) {
	    List<String> errors = Collections.singletonList(ex.getMessage());

	    ErrorResponse errorResponse = ErrorResponse.builder()
				    								.code(HttpStatus.INTERNAL_SERVER_ERROR.value())
				    								.message(errors)
				    								.build();
	    return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * Handle runtime exceptions.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public final ResponseEntity<ErrorResponse> handleRuntimeExceptions(RuntimeException ex) {
	    List<String> errors = Collections.singletonList(ex.getMessage());

	    ErrorResponse errorResponse = ErrorResponse.builder()
				    								.code(HttpStatus.INTERNAL_SERVER_ERROR.value())
				    								.message(errors)
				    								.build();
	    return new ResponseEntity<>(errorResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	/**
	 * Gets the errors map.
	 *
	 * @param errors the errors
	 * @return the errors map
	 */
	private Map<String, List<String>> getErrorsMap(List<String> errors) {
		Map<String, List<String>> errorResponse = new HashMap<>();
		errorResponse.put("errors", errors);
		return errorResponse;
	}

}
