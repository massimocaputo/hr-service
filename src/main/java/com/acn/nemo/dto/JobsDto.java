package com.acn.nemo.dto;


import java.io.Serializable;
import java.math.BigDecimal;

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
 * Instantiates a new jobs dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new jobs dto.
 *
 * @param jobId the job id
 * @param jobTitle the job title
 * @param minSalary the min salary
 * @param maxSalary the max salary
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class JobsDto implements Serializable {
	
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7186381847828240537L;

	/** The job id. */
	private String jobId;

    /** The job title. */
    private String jobTitle;

    /** The min salary. */
    private BigDecimal minSalary;

    /** The max salary. */
    private BigDecimal maxSalary;

}
