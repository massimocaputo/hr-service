package com.acn.nemo.dto;

import java.io.Serializable;

import com.acn.nemo.model.Department;
import com.acn.nemo.model.Employee;
import com.acn.nemo.model.Job;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new job history key dto.
 *
 * @param department the department
 * @param employee the employee
 * @param job the job
 */
@AllArgsConstructor

/**
 * Instantiates a new job history key dto.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class JobHistoryKeyDto implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -557704585811106388L;
	
	
	/** The department. */
	private Department department;

	/** The employee. */
	private Employee employee;

	/** The job. */
	private Job job;

}
