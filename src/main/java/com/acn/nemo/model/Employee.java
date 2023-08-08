package com.acn.nemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * The Class Employee.
 */
@Entity
@Table(name="employees")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new employee.
 */
@NoArgsConstructor

/**
 * Instantiates a new employee.
 *
 * @param employeeId the employee id
 * @param commissionPct the commission pct
 * @param email the email
 * @param firstName the first name
 * @param hireDate the hire date
 * @param lastName the last name
 * @param managerId the manager id
 * @param phoneNumber the phone number
 * @param salary the salary
 * @param department the department
 */
@AllArgsConstructor
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3650486956494793530L;

	/** The employee id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id", unique=true, nullable=false)
	private Long employeeId;

	/** The commission pct. */
	@Column(name="commission_pct", precision=10, scale=2)
	private BigDecimal commissionPct;

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


	
	/** The department. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="DEPARTMENT_ID")
	@EqualsAndHashCode.Exclude
	@JsonBackReference
	private Department department;

	
	

}