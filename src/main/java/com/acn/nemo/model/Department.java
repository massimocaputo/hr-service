package com.acn.nemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.StandardException;

/**
 * The Class Department.
 */
@Entity
@Table(name = "DEPARTMENTS")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new department.
 */
@NoArgsConstructor

/**
 * Instantiates a new department.
 *
 * @param departmentId the department id
 * @param departmentName the department name
 * @param location the location
 */
@AllArgsConstructor
public class Department implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8914798691981930054L;

	
	/** The department id. */
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "DEPT_SEQ" )
	@SequenceGenerator(sequenceName = "DEPARTMENTS_SEQ", name = "DEPT_SEQ",
						initialValue = 10,allocationSize = 10)
	@Column(name = "DEPARTMENT_ID", nullable = false, unique = true )
	private Long departmentId;
	
	/** The department name. */
	@Column(name="DEPARTMENT_NAME",nullable = false, length = 30 )
	private String departmentName;
	
	/** The location. */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="location_id")
	@EqualsAndHashCode.Exclude
	@JsonBackReference
	private Location location;
	
	
	/** The employees. */
//	@OneToMany
//	@JsonManagedReference
//	private List<Employee> employees = new ArrayList<>();

	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 * @return the employee
	 */
//	public Employee addEmployee(Employee employee) {
//		getEmployees().add(employee);
//		employee.setDepartment(this);
//
//		return employee;
//	}
	
	
	/**
	 * Removes the employee.
	 *
	 * @param employee the employee
	 * @return the employee
	 */
//	public Employee removeEmployee(Employee employee) {
//		getEmployees().remove(employee);
//		employee.setDepartment(null);
//
//		return employee;
//	}
}
