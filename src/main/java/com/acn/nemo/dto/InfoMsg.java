package com.acn.nemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
 * Instantiates a new info msg.
 *
 * @param message the message
 */
@AllArgsConstructor

/**
 * Instantiates a new info msg.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class InfoMsg {

	/** The message. */
	public String message;
}
