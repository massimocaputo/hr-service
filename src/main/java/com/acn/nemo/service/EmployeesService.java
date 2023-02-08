package com.acn.nemo.service;

import java.util.List;
import com.acn.nemo.dto.EmployeesDto;


public interface EmployeesService {

	EmployeesDto getById(Integer id);

	List<EmployeesDto> getAllEmployees();

	EmployeesDto createEmployee(EmployeesDto dto);

    

 
}
