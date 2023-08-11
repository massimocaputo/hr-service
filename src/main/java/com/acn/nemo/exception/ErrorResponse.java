package com.acn.nemo.exception;

import java.util.List;

import lombok.Builder;
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

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class ErrorResponse {
	
	/** The code. */
	private int code;
	
	/** The message. */
	private List<String> message;

}
