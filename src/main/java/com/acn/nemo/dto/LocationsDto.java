package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * Instantiates a new locations dto.
 */

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


}
