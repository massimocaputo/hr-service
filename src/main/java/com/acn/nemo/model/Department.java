package com.acn.nemo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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