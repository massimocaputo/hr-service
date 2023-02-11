package com.acn.nemo.mapper;

import com.acn.nemo.dto.EmployeesDto;
import com.acn.nemo.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


/**
 * The interface Employees mapper.
 */
@Mapper(componentModel = "spring")
public interface EmployeesMapper {

    /**
     * The constant INSTANCE.
     */
    EmployeesMapper INSTANCE = Mappers.getMapper(EmployeesMapper.class);

    /**
     * Model to dto employees dto.
     *
     * @param employees the employees
     * @return the employees dto
     */
    EmployeesDto modelToDto(Employee employees);

    /**
     * Dto to model.
     *
     * @param employeesDto the employees dto
     * @return the employee
     */
    Employee dtoToModel(EmployeesDto employeesDto);
    
    /**
     * Modelt to dtos.
     *
     * @param emps the emps
     * @return the list
     */
    List<EmployeesDto> modelToDtos(List<Employee> emps);

}
