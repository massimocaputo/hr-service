package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    @NotNull(message = "{regionsDto.notNull.regionName}")
    private String regionName;
    
    /** The countries. */
   // @NotEmpty(message = "{regionsDto.notEmpty.countries}")
    private List<CountryDto> countries;

}
