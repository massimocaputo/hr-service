package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class RegionsDto implements Serializable {
    
    private static final long serialVersionUID = -2375087521949932771L;

	private String regionId;

    private String regionName;
    
    private List<CountryDto> countries;

}
