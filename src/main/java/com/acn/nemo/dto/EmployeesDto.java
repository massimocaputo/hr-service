package com.acn.nemo.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.acn.nemo.model.Department;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeesDto implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @NotEmpty(message = "{employeeId.notempty}")
	@Size(min = 2, max = 3, message = "{employeeId.size}")
    private String employeeId;

	private BigDecimal commissionPct;

	private Long departmentId;

	@NotEmpty(message = "{email.notempty}")
	@Email
	private String email;

	private String firstName;

	private Date hireDate;

	private String jobId;

	private String lastName;

	private int managerId;

	private String phoneNumber;

	private BigDecimal salary;

	@Builder.Default
	private List<Department> departments = new ArrayList<>();

	//private List<JobHistory> jobHistorieList;

}
