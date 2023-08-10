package com.acn.nemo.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the department dtos.
 *
 * @return the department dtos
 */
@Getter

/**
 * Sets the department dtos.
 *
 * @param departmentDtos the new department dtos
 */
@Setter

/**
 * Instantiates a new location dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new location dto.
 *
 * @param locationId the location id
 * @param streetAddress the street address
 * @param postalCode the postal code
 * @param city the city
 * @param stateProvince the state province
 * @param departmentDtos the department dtos
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class LocationDto {
	
	/** The location id. */
	private Long locationId;
	
	/** The street address. */
	private String streetAddress;
	
	/** The postal code. */
	private String postalCode;
	
	/** The city. */
	private String city;
	
	/** The state province. */
	private String stateProvince;
	
	/** The department dtos. */
	private List<DepartmentDto> departmentDtos;

}
