package com.acn.nemo.dto;


import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Instantiates a new regions dto.
 */
@Data
@Builder
@ApiModel(description = "Region Model")
public class RegionsDto implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2375087521949932771L;

	/** The region id. */
    @ApiModelProperty(value = "Region id")
	private String regionId;

    /** The region name. */
    @ApiModelProperty(value = "Nome Region")
	@NotBlank(message = "Nome region non puo essere vuoto")
    @NotNull(message = "{regionsDto.notNull.regionName}")
    private String regionName;
    
    /** The countries. */
    @ApiModelProperty(value = "List Country")
    @NotEmpty(message = "{regionsDto.notEmpty.countries}")
    private List<CountryDto> countries;

}
