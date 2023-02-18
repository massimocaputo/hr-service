package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.JobHistoryKeyDto;
import com.acn.nemo.model.JobHistoryKey;

@Mapper
public interface JobHistoryKeyMapper {
	
	JobHistoryKeyDto modelToDto(JobHistoryKey jobHistoryKey );
	
	JobHistoryKey dtoToModel(JobHistoryKeyDto jobHistoryKeyDto);

}
