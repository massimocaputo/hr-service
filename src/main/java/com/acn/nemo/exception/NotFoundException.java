package com.acn.nemo.exception;

import lombok.Getter;
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
public class NotFoundException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6707935457121284430L;
	
	/** The message. */
	private String message = "Rsiorsa non trovata";

	/**
	 * Instantiates a new not found exception.
	 *
	 * @param message the message
	 */
	public NotFoundException(String message) {
		super(message);
		this.message = message;
	}

	/**
	 * Instantiates a new not found exception.
	 */
	public NotFoundException() {
		super();
	}

	

	
	

}
