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
public class RegionDto {
	
	
	/** The id. */
	private String regionId;
	
	/** The region name. */
	private String regionName;

	/** The countries. */
	private List<CountryDto> countries; 
}
