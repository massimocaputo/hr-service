package com.acn.nemo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The Class Department.
 */
@Entity
@Table(name = "DEPARTMENTS")

/**
 * Instantiates a new department.
 */
@Data
public class Department implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8914798691981930054L;

	
	/** The department id. */
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
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
