package com.acn.nemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The Class DuplicateException.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateException extends Exception {


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3095083412568703628L;


	/**
	 * Instantiates a new duplicate exception.
	 *
	 * @param message the message
	 */
	public DuplicateException(String message) {
        super(message);
    }
    
   
    /**
     * Instantiates a new duplicate exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public DuplicateException(String message, Throwable cause) {
        super(message, cause);
    }
}
