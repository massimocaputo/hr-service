package com.acn.nemo.dto;

import java.io.Serializable;
import java.util.Date;

import com.acn.nemo.model.Department;
import com.acn.nemo.model.Employee;
import com.acn.nemo.model.Job;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class JobHistoryDto.
 */

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new job history dto.
 *
 * @param endDate the end date
 * @param startDate the start date
 * @param department the department
 * @param employee the employee
 * @param job the job
 */
@AllArgsConstructor

/**
 * Instantiates a new job history dto.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class JobHistoryDto implements Serializable {


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6501559057246719409L;

	
	/** The end date. */
	private Date endDate;

	/** The start date. */
	private Date startDate;

	/** The department. */
	private Department department;

	/** The employee. */
	private Employee employee;

	/** The job. */
	private Job job;
}
