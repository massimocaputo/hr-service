package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

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
 * Instantiates a new country dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new country dto.
 *
 * @param countryId the country id
 * @param countryName the country name
 * @param locations the locations
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
@ApiModel(description = "Country Model")
public class CountryDto implements Serializable {
	
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5356897941529458590L;

	/** The country id. */
    @ApiModelProperty(value = "The country id")
	private String countryId;

	/** The country name. */
    @ApiModelProperty(value = "The country name")
	private String countryName;
	
	/** The locations. */
    @ApiModelProperty(value = "The locations")
	private List<LocationsDto> locations;

}
