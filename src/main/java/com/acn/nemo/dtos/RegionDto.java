package com.acn.nemo.dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the countries.
 *
 * @return the countries
 */
@Getter

/**
 * Sets the countries.
 *
 * @param countries the new countries
 */
@Setter

/**
 * Instantiates a new region dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new region dto.
 *
 * @param regionName the region name
 * @param countries the countries
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
public class RegionDto {
	
	
	private String id;
	
	/** The region name. */
	private String regionName;

	/** The countries. */
	private List<CountryDto> countries; 
}
