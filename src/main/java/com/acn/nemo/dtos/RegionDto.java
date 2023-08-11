package com.acn.nemo.dtos;

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
public class RegionDto {
	
	
	/** The id. */
	private String id;
	
	/** The region name. */
	private String regionName;

	/** The countries. */
	private List<CountryDto> countries; 
}
