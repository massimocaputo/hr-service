package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.JobHistoryDto;
import com.acn.nemo.model.JobHistory;


@Mapper(componentModel = "spring", uses = {JobMapper.class, JobHistoryKeyMapper.class})
public interface JobHistoryMapper {

	JobHistoryDto modelToDto(JobHistory jobHistory);
	
	
	JobHistory dtoToModel(JobHistoryDto jobHistory);
}
