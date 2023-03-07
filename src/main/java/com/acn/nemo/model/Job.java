package com.acn.nemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the jobs database table.
 * 
 */
@Entity
@Table(name="jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@OneToMany(mappedBy="job", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<JobHistory> jobHistories;

}