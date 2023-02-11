package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Instantiates a new country dto.
 */
@Data
public class CountryDto implements Serializable {
	
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5356897941529458590L;

	/** The country id. */
	private String countryId;

	/** The country name. */
	private String countryName;
	
	/** The locations. */
	private List<LocationsDto> locations;

}
