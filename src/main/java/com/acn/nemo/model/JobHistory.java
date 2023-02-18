package com.acn.nemo.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * The persistent class for the job_history database table.
 * 
 */
@Entity
@Table(name="job_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="JobHistory.findAll", query="SELECT j FROM JobHistory j")
public class JobHistory implements Serializable {
	
		
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1925327518017471604L;

	/** The job history key. */
	@EmbeddedId
	private JobHistoryKey jobHistoryKey;

	/** The end date. */
	@Temporal(TemporalType.DATE)
	@Column(name="end_date", nullable=false)
	private Date endDate;

	/** The start date. */
	@Temporal(TemporalType.DATE)
	@Column(name="start_date", nullable=false)
	private Date startDate;

	/** The department. */
	//bi-directional many-to-one association to Department
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="department_id", nullable=false)
	@EqualsAndHashCode.Exclude
	@JsonBackReference
	private Department department;

	/** The employee. */
	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="employee_id", nullable=false)
	private Employee employee;

	/** The job. */
	//bi-directional many-to-one association to Job
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="job_id", nullable=false)
	@JsonBackReference
	private Job job;

}