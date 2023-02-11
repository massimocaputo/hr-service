package com.acn.nemo.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.acn.nemo.model.Department;

import lombok.AllArgsConstructor;
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
 */
@NoArgsConstructor

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
 * @param departments the departments
 */
@AllArgsConstructor
public class EmployeesDto implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
   
    /** The employee id. */
    @NotEmpty(message = "{employeeId.notempty}")
	@Size(min = 2, max = 3, message = "{employeeId.size}")
    private String employeeId;

	/** The commission pct. */
	private BigDecimal commissionPct;

	/** The department id. */
	private Long departmentId;

	/** The email. */
	@NotEmpty(message = "{email.notempty}")
	@Email
	private String email;

	/** The first name. */
	private String firstName;

	/** The hire date. */
	private Date hireDate;

	/** The job id. */
	private String jobId;

	/** The last name. */
	private String lastName;

	/** The manager id. */
	private int managerId;

	/** The phone number. */
	private String phoneNumber;

	/** The salary. */
	private BigDecimal salary;

	/** The departments. */
	private List<Department> departments;

//	@Builder.Default
//	private List<JobHistory> jobHistories = new ArrayList<>();

}
