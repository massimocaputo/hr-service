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
public class CountryDto {

	/** The country id. */
	private String countryId;
	
	/** The country name. */
	private String countryName;
	
	/** The location dto. */
	private List<LocationDto> locations;
}
