package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Instantiates a new departments dto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
