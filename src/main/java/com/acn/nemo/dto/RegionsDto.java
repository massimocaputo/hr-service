package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class RegionsDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long regionId;

    private String regionName;

}
