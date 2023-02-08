package com.acn.nemo.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the departments database table.
 * 
 */
@Entity
@Table(name="departments")

/**
 * Instantiates a new department.
 */
@Data
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The department id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="department_id", unique=true, nullable=false)
	private int departmentId;

	/** The department name. */
	@Column(name="department_name", nullable=false, length=30)
	private String departmentName;

	/** The employee. */
	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="manager_id")
	private Employee employee;

	/** The location. */
	//bi-directional many-to-one association to Location
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="location_id")
	private Location location;

	/** The job histories. */
	//bi-directional many-to-one association to JobHistory
	@OneToMany(mappedBy="department")
	private List<JobHistory> jobHistories;

	
}