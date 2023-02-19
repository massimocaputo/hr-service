package com.acn.nemo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	private int code;
	private String msg;
}
