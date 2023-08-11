package com.acn.nemo.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the department name.
 *
 * @return the department name
 */
@Getter

/**
 * Sets the department name.
 *
 * @param departmentName the new department name
 */
@Setter

/**
 * Instantiates a new department dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new department dto.
 *
 * @param departmentName the department name
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class DepartmentDto {

	
	 /** The department name. */
 	private String departmentName;
 	
}
