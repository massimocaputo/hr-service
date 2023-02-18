package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.JobsDto;
import com.acn.nemo.model.Job;

@Mapper(componentModel = "spring")
public interface JobMapper {

	JobsDto modeltoDto(Job job);
	
	Job dtoToModel(JobsDto jobsDto);
}
