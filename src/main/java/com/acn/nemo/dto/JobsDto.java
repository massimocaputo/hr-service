package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Instantiates a new jobs dto.
 */
@Data
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
