package com.acn.nemo.dtos;

import lombok.Data;

@Data
public class LocationDto {
	
	private Long locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private String countryId;

}
