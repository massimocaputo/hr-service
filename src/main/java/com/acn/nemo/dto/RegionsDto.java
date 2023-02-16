package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Instantiates a new regions dto.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionsDto implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2375087521949932771L;

	/** The region id. */
	private String regionId;

    /** The region name. */
    private String regionName;
    
    /** The countries. */
    private List<CountryDto> countries;

}
