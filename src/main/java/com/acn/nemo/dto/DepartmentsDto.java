package com.acn.nemo.dto;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Departments dto.
 */

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new departments dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new departments dto.
 *
 * @param departmentId the department id
 * @param departmentName the department name
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class DepartmentsDto implements Serializable {
	
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The department id. */
    private Long departmentId;

    /** The department name. */
    private String departmentName;

    
}
