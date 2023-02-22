package com.acn.nemo.dto;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * Instantiates a new departments dto.
 *
 * @param departmentId the department id
 * @param departmentName the department name
 * @param employee the employee
 */
@AllArgsConstructor

/**
 * Instantiates a new departments dto.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
@ApiModel(description = "Department Model")
public class DepartmentsDto implements Serializable {
	
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6255630630384500299L;

	/** The department id. */
    @ApiModelProperty(value = "Department id")
    private Long departmentId;

    /** The department name. */
    @ApiModelProperty(value = "Department name")
    private String departmentName;
    
    /** The employee. */
//    private List<JobHistoryDto> jobHistories;
    
    /** The employee. */
    @ApiModelProperty(value = "Employees")
    private EmployeesDto employee;

    
}
