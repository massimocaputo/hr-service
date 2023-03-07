package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

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
 * Instantiates a new locations dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new locations dto.
 *
 * @param locationId the location id
 * @param streetAddress the street address
 * @param postalCode the postal code
 * @param city the city
 * @param stateProvince the state province
 * @param departments the departments
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
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
