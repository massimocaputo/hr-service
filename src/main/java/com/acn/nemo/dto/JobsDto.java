package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class JobsDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String jobId;

    private String jobTitle;

    private BigDecimal minSalary;

    private BigDecimal maxSalary;

}
