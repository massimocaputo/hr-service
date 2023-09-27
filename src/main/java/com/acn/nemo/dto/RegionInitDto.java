package com.acn.nemo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * The type Region init dto.
 */
@Data
@Builder
public class RegionInitDto {


    /** The id. */
    private String regionId;

    /** The region name. */
    private String regionName;
}
