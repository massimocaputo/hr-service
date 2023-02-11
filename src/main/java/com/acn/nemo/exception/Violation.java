package com.acn.nemo.advice;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
//@JsonTypeInfo(
//        use = JsonTypeInfo.Id.NAME, 
//        include = JsonTypeInfo.As.PROPERTY, 
//        property = "type")
public class Violation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4457173804346440861L;

	private final String fieldName;

	private final String message;
}
