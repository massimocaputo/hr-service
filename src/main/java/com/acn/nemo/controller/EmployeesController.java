package com.acn.nemo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.dto.EmployeesDto;
import com.acn.nemo.service.EmployeesService;

@RestController
@RequestMapping("/employee")
@Validated
public class EmployeesController {

	private static final Logger logger = LogManager.getLogger(EmployeesController.class);

	@Autowired
	private EmployeesService employeesService;

	@PostMapping("/createEmp")
	public ResponseEntity<EmployeesDto> createEmployee(@Valid @RequestBody EmployeesDto dto) {
		logger.info("INIT EmployeesController - createEmployee");		
		EmployeesDto employeesDto = employeesService.createEmployee(dto);
		if (null != employeesDto) {
			logger.info("END EmployeesController - createEmployee");
			return new ResponseEntity<>(employeesDto, HttpStatus.CREATED);
		} else {
			logger.info("END EmployeesController - createEmployee");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
//        employeesService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") Long id,
//                       @Valid @RequestBody EmployeesDto dto) {
//        employeesService.update(id, dto);
//    }

	@GetMapping("/{id}")
	public ResponseEntity<EmployeesDto> getById(@Valid @NotNull @PathVariable("id") Integer id) {
		logger.info("Init getById");
		EmployeesDto employeesDto = employeesService.getById(id);
		if (null != employeesDto) {
			return new ResponseEntity<>(employeesDto, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<EmployeesDto>> findAllEmployees() {
		logger.info("findAllEmployees");
		List<EmployeesDto> employeesDtoList = employeesService.getAllEmployees();
		if (null != employeesDtoList) {
			return new ResponseEntity<>(employeesDtoList, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
