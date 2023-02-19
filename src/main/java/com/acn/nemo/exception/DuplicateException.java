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
public class DuplicateException extends Exception{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8310258267402863388L;

	/** The message. */
	private String message = "Risorsa duplicata";

	/**
	 * Instantiates a new duplicate exception.
	 */
	public DuplicateException() {
		super();
	}

	/**
	 * Instantiates a new duplicate exception.
	 *
	 * @param message the message
	 */
	public DuplicateException(String message) {
		super();
		this.message = message;
	}
	
	
}
