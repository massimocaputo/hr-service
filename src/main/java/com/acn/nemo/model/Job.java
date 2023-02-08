package com.acn.nemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the jobs database table.
 * 
 */
@Entity
@Table(name="jobs")
@Data
@NamedQuery(name="Job.findAll", query="SELECT j FROM Job j")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="job_id", unique=true, nullable=false, length=10)
	private String jobId;

	@Column(name="job_title", nullable=false, length=35)
	private String jobTitle;

	@Column(name="max_salary", precision=10)
	private BigDecimal maxSalary;

	@Column(name="min_salary", precision=10)
	private BigDecimal minSalary;

	//bi-directional many-to-one association to JobHistory
	@OneToMany(mappedBy="job")
	private List<JobHistory> jobHistories;

}