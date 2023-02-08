package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.List;
import com.acn.nemo.model.Location;
import com.acn.nemo.model.Region;

@Data
public class CountriesDto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String countryId;

	private String countryName;
	private Region region;
	private List<Location> locations;

}
