package com.acn.nemo.service.impl;

import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.acn.nemo.dto.EmployeesDto;
import com.acn.nemo.mapper.EmployeesMapper;
import com.acn.nemo.model.Employee;
import com.acn.nemo.repository.EmployeesRepository;
import com.acn.nemo.service.EmployeesService;


/**
 * The Class EmployeesServiceImpl.
 */
@Service
@Transactional
public class EmployeesServiceImpl  implements EmployeesService{

	
	/** The employees repository. */
	@Autowired
    private EmployeesRepository employeesRepository;

	/** The employee mapper. */
	@Autowired
	private EmployeesMapper employeeMapper;

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	@Override
	public EmployeesDto getById(Integer id) {
		if(ObjectUtils.isNotEmpty(id)) {
			Optional<Employee> valueEmp = employeesRepository.findById(Long.valueOf(id));
			if(valueEmp.isPresent()) {
				return employeeMapper.modelToDto(valueEmp.get());
			}else {
				return null;
			}
		}
		return null;
	}

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	@Override
	public List<EmployeesDto> getAllEmployees() {
		return employeeMapper.modelToDtos(employeesRepository.findAll());
	}

	@Override
	
	public EmployeesDto createEmployee(EmployeesDto dto) {
		if( ObjectUtils.isNotEmpty(dto) ) {
			
			Optional<Employee> valueEmp = employeesRepository.findById(
									Long.valueOf(dto.getEmployeeId())
									);
			if( valueEmp.isPresent() ) return employeeMapper.modelToDto(
					employeesRepository.save(employeeMapper.dtoToModel(dto))
			);
		}
		return null;
	}
	
	
	  
}
