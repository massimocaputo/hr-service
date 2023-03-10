package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
 * Instantiates a new regions dto.
 *
 * @param regionId the region id
 * @param regionName the region name
 * @param countries the countries
 */
@AllArgsConstructor

/**
 * Instantiates a new regions dto.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
//@ApiModel(description = "Region Model")
public class RegionsDto implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2375087521949932771L;

	/** The region id. */
    //@ApiModelProperty(notes = "Region id")
	private String regionId;

    /** The region name. */
    //@ApiModelProperty(notes = "Nome Region")
	@NotBlank(message = "Nome region non puo essere vuoto")
    @NotNull(message = "{regionsDto.notNull.regionName}")
    @Size(max = 25 , min = 1)
    private String regionName;
    
    /** The countries. */
    //@ApiModelProperty(notes = "List Country")
    @NotEmpty(message = "{regionsDto.notEmpty.countries}")
    private List<CountryDto> countries;

}
