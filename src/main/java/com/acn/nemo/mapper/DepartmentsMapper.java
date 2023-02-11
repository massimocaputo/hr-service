/**
 * 
 */
package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.DepartmentsDto;
import com.acn.nemo.model.Department;

/**
 * The interface Departments mapper.
 */
@Mapper(componentModel = "spring")
public interface DepartmentsMapper {

	/**
	 * Modelto dto departments dto.
	 *
	 * @param dept the dept
	 * @return the departments dto
	 */
	DepartmentsDto modeltoDto(Department dept);

	/**
	 * Dto to model department.
	 *
	 * @param dto the dto
	 * @return the department
	 */
	Department dtoToModel(DepartmentsDto dto);
}
