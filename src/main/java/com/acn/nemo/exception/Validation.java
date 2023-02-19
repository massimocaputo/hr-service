package com.acn.nemo.exception;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Validation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4457173804346440861L;

	private final String fieldName;

	private final String message;
}
