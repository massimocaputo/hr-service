package com.acn.nemo.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class DepartmentsDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long departmentId;

    private String departmentName;

    private Long managerId;

    private Long locationId;

}
