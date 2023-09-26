package com.acn.nemo.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

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
	
	/** The department dto. */
	private List<DepartmentDto> departmentDtos;

}
