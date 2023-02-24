package com.acn.nemo.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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
 * Instantiates a new employees dto.
 *
 * @param employeeId the employee id
 * @param commissionPct the commission pct
 * @param departmentId the department id
 * @param email the email
 * @param firstName the first name
 * @param hireDate the hire date
 * @param jobId the job id
 * @param lastName the last name
 * @param managerId the manager id
 * @param phoneNumber the phone number
 * @param salary the salary
 */
@AllArgsConstructor

/**
 * Instantiates a new employees dto.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder
//@ApiModel(description = "Employees Model")
public class EmployeesDto implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
   
    /** The employee id. */
    //@ApiModelProperty(value = "The employee id")
    @NotEmpty(message = "{employeesDto.notEmpty.employeeId}")
	@Size(min = 2, max = 3, message = "{employeesDto.size.employeeId}")
    private String employeeId;

	/** The commission pct. */
    //@ApiModelProperty(value = "The commission pct")
	private BigDecimal commissionPct;

	/** The department id. */
    //@ApiModelProperty(value = "The department id")
	private Long departmentId;

	/** The email. */
    //@ApiModelProperty(value = "The email")
	@NotEmpty(message = "{employeesDto.notEmpty.email}")
	@Email
	private String email;

	/** The first name. */
    //@ApiModelProperty(value = "The first name")
	private String firstName;

	/** The hire date. */
    //@ApiModelProperty(value = "The hire date")
	private Date hireDate;

	/** The job id. */
    //@ApiModelProperty(value = "The job id")
	private String jobId;

	/** The last name. */
    //@ApiModelProperty(value = "The last name")
	private String lastName;

	/** The manager id. */
    //@ApiModelProperty(value = "The manager id")
	private int managerId;

	/** The phone number. */
    //@ApiModelProperty(value = "The phone number")
	private String phoneNumber;

	/** The salary. */
    //@ApiModelProperty(value = "The salary")
	private BigDecimal salary;

	/** The departments. */
//	private List<DepartmentsDto> departments;


//	private List<JobHistoryDto> jobHistories;

}
