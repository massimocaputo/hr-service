package com.acn.nemo.exception;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/**
 * Gets the message error.
 *
 * @return the message error
 */
@Getter

/**
 * Sets the message error.
 *
 * @param messageError the new message error
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
	
	/** The message error. */
	private List<String> message;

}
