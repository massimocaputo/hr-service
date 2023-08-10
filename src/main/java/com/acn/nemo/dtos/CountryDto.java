package com.acn.nemo.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the location dtos.
 *
 * @return the location dtos
 */
@Getter

/**
 * Sets the location dtos.
 *
 * @param locationDtos the new location dtos
 */
@Setter

/**
 * Instantiates a new country dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new country dto.
 *
 * @param countryId the country id
 * @param countryName the country name
 * @param locationDtos the location dtos
 */
@AllArgsConstructor

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
	
	/** The location dtos. */
	private List<LocationDto> locations;
}
