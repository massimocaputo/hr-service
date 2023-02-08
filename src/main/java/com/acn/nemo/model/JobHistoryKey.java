package com.acn.nemo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class JobHistoryKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4902613214400866790L;

	
	private Department department;

	private Employee employee;

	private Job job;
	
}
