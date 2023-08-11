package com.acn.nemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The Class UserNotFoundException.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception {
    
    
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5379578392856705438L;

	/**
	 * Instantiates a new user not found exception.
	 *
	 * @param message the message
	 */
	public NotFoundException(String message) {
        super(message);
    }
    
    /**
     * Instantiates a new user not found exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
