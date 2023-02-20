package com.acn.nemo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Gets the message.
 *
 * @return the message
 */
@Getter

/**
 * Sets the message.
 *
 * @param message the new message
 */
@Setter

/**
 * Instantiates a new not found exception.
 */
@NoArgsConstructor

/**
 * Instantiates a new not found exception.
 *
 * @param message the message
 */
@AllArgsConstructor
public class NotFoundException extends Exception {

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6707935457121284430L;
	
	
	/** The message. */
	private String message;

	
	

	
	

}
