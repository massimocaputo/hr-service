package com.acn.nemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.acn.nemo.dto.JobHistoryDto;
import com.acn.nemo.model.JobHistory;


@Mapper(componentModel = "spring")
public interface JobHistoryMapper{

	JobHistoryDto modelToDto(JobHistory jobHistory);
	
	@Mapping(target = "jobHistoryKey", ignore = true)
	JobHistory dtoToModel(JobHistoryDto jobHistory);
}
