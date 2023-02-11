/**
 * 
 */
package com.acn.nemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.acn.nemo.dto.DepartmentsDto;
import com.acn.nemo.model.Department;

@Mapper
public interface DepartmentsMapper {

	DepartmentsMapper INSTANCE = Mappers.getMapper(DepartmentsMapper.class);
	
	DepartmentsDto modeltoDto(Department dept);
	
	Department dtoToModel(DepartmentsDto dto);
}
