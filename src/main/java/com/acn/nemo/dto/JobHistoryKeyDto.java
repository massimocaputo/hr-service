package com.acn.nemo.dto;

import java.io.Serializable;

import com.acn.nemo.model.Department;
import com.acn.nemo.model.Employee;
import com.acn.nemo.model.Job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobHistoryKeyDto implements Serializable{

	private static final long serialVersionUID = -557704585811106388L;
	
	
	private Department department;

	private Employee employee;

	private Job job;

}
