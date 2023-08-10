package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dtos.DepartmentDto;
import com.acn.nemo.model.Department;

/**
 * The Interface DepartmentMapper.
 */
@Mapper
public interface DepartmentMapper {

	/**
	 * Departmet to department dto.
	 *
	 * @param department the department
	 * @return the department dto
	 */
	DepartmentDto departmetToDepartmentDto (Department department);
	
	/**
	 * Department dto to department.
	 *
	 * @param departmentDto the department dto
	 * @return the department
	 */
	Department departmentDtoToDepartment (DepartmentDto departmentDto);
}
