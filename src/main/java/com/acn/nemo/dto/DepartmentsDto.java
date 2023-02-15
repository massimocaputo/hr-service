package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import lombok.Data;


/**
 * Instantiates a new departments dto.
 */
@Data
public class DepartmentsDto implements Serializable {
	
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6255630630384500299L;

	/** The department id. */
    private Long departmentId;

    /** The department name. */
    private String departmentName;
    
    /** The job histories. */
//    private List<JobHistoryDto> jobHistories;
    
    /** The employee. */
    private EmployeesDto employee;

    
}
