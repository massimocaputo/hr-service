package com.acn.nemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the employees database table.
 * 
 */
@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The employee id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id", unique=true, nullable=false)
	private Long employeeId;

	/** The commission pct. */
	@Column(name="commission_pct", precision=10, scale=2)
	private BigDecimal commissionPct;

	/** The department id. */
	@Column(name="department_id")
	private Long departmentId;

	/** The email. */
	@Column(nullable=false, length=25)
	private String email;

	/** The first name. */
	@Column(name="first_name", length=20)
	private String firstName;

	/** The hire date. */
	@Temporal(TemporalType.DATE)
	@Column(name="hire_date", nullable=false)
	private Date hireDate;

	/** The job id. */
	@Column(name="job_id", nullable=false, length=10)
	private String jobId;

	/** The last name. */
	@Column(name="last_name", nullable=false, length=25)
	private String lastName;

	/** The manager id. */
	@Column(name="manager_id")
	private Long managerId;

	/** The phone number. */
	@Column(name="phone_number", length=20)
	private String phoneNumber;

	/** The salary. */
	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal salary;

	/** The departments. */
	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Department> departments;

	/** The job histories. */
	//bi-directional many-to-one association to JobHistory
	@OneToMany(mappedBy="employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<JobHistory> jobHistories;

	

}