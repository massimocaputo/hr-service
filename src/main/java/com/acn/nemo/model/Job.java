package com.acn.nemo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class Job.
 */
@Entity
@Table(name="JOBS")

/**
 * Gets the max salary.
 *
 * @return the max salary
 */
@Getter

/**
 * Sets the max salary.
 *
 * @param maxSalary the new max salary
 */
@Setter

/**
 * Instantiates a new job.
 */
@NoArgsConstructor
public class Job implements Serializable{

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5419689936469259582L;

	/** The job id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JOB_ID", nullable = false, unique = true, length = 10)
	private String jobId;
	
	/** The job title. */
	@Column(name = "JOB_TITLE", nullable = false, length = 35)
	private String jobTitle;
	
	/** The min salary. */
	@Column(name = "MIN_SALARY", nullable = true, length = 6)
	private Long minSalary;
	
	/** The max salary. */
	@Column(name = "MAX_SALARY", nullable = true, length = 6)
	private Long maxSalary;

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	//@JsonBackReference
	//private List<Employee> employees = new ArrayList<>();
	
}
