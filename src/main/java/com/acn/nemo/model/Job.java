package com.acn.nemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Job.
 */
@Entity
@Table(name="JOBS")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new job.
 */
@NoArgsConstructor

/**
 * Instantiates a new job.
 *
 * @param jobId the job id
 * @param jobTitle the job title
 * @param minSalary the min salary
 * @param maxSalary the max salary
 */
@AllArgsConstructor
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
