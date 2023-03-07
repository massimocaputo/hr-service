package com.acn.nemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.dto.EmployeesDto;
import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.exception.DuplicateException;
import com.acn.nemo.service.EmployeesService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("api/employee")
@Log4j2
@Tag(name = "EmployeesController" , description = "Controller Operazioni su Employees")
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;


    @Operation(summary = "Crea Employees" , description = "Ritorna i dati Employees creati in formato JSON", method = "HTTP" )
    @ApiResponses(value = {
		   			@ApiResponse(responseCode = "201" , description = "Employee creato" , 
		   					content = @Content(mediaType = "application/json", schema = @Schema(implementation = EmployeesDto.class))),
		   			@ApiResponse(responseCode = "401", description = "Utente non Autenticato", content = @Content),
		   			@ApiResponse(responseCode = "403", description = "Utente non Autorizzato", content = @Content),
					@ApiResponse(responseCode = "404", description = "Regions not found", 
					content = @Content(mediaType = "application/json", schema = @Schema(implementation = DuplicateException.class))) 
		   			}
    			)
	@PostMapping("/inserisci")
	public ResponseEntity<EmployeesDto> createEmployee(@Valid @RequestBody EmployeesDto dto) {
		log.info("INIT EmployeesController - createEmployee");		
		EmployeesDto employeesDto = employeesService.createEmployee(dto);
		if (null != employeesDto) {
			log.info("END EmployeesController - createEmployee");
			return new ResponseEntity<>(employeesDto, HttpStatus.CREATED);
		} else {
			log.info("END EmployeesController - createEmployee");
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
		log.info("Init getById");
		EmployeesDto employeesDto = employeesService.getById(id);
		if (null != employeesDto) {
			return new ResponseEntity<>(employeesDto, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/all" , produces = "application/json")
	public ResponseEntity<List<EmployeesDto>> findAllEmployees() {
		log.info("findAllEmployees");
		List<EmployeesDto> employeesDtoList = employeesService.getAllEmployees();
		if (null != employeesDtoList) {
			return new ResponseEntity<>(employeesDtoList, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
