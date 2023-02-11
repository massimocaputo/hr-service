package com.acn.nemo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

import com.acn.nemo.model.Employee;
import com.acn.nemo.model.JobHistory;
import com.acn.nemo.model.Location;

/**
 * The type Departments dto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentsDto implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    private Long departmentId;

    private String departmentName;

    private Employee employee;
    
    private Location location;
    
    private List<JobHistory> jobHistories;

}
