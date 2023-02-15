package com.acn.nemo.dto;

import java.io.Serializable;
import java.util.Date;

import com.acn.nemo.model.Department;
import com.acn.nemo.model.Employee;
import com.acn.nemo.model.Job;

import lombok.Data;

/**
 * Instantiates a new job history dto.
 */
@Data
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
