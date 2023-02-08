package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class LocationsDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long locationId;

    private String streetAddress;

    private String postalCode;

    private String city;

    private String stateProvince;

    private String countryId;

}
