package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Instantiates a new locations dto.
 */
@Data
public class LocationsDto implements Serializable {
	
  	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7477174982737118732L;

	/** The location id. */
    private Integer locationId;

    /** The street address. */
    private String streetAddress;

    /** The postal code. */
    private String postalCode;

    /** The city. */
    private String city;

    /** The state province. */
    private String stateProvince;
    
    /** The departments. */
    private List<DepartmentsDto> departments;


}
