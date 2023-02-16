package com.acn.nemo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the departments database table.
 * 
 */
@Entity
@Table(name="departments")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@EqualsAndHashCode.Exclude
	@JoinColumn(name="location_id")
	private Location location;

	/** The job histories. */
	//bi-directional many-to-one association to JobHistory
	@OneToMany(mappedBy="department", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<JobHistory> jobHistories;

	
}