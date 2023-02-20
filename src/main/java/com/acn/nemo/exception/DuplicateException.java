package com.acn.nemo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class DuplicateException.
 */

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

/**
 * Sets the message.
 *
 * @param message the new message
 */
@Setter

/**
 * Instantiates a new duplicate exception.
 */
@NoArgsConstructor

/**
 * Instantiates a new duplicate exception.
 *
 * @param message the message
 */
@AllArgsConstructor
public class DuplicateException extends Exception{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8310258267402863388L;

	/** The message. */
	private String message = "Risorsa duplicata";

	
	
	
}
