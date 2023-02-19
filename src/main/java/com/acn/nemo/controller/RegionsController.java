package com.acn.nemo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.exception.NotFoundException;
import com.acn.nemo.service.RegionsService;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping("api/regions")
@Validated
@Log4j2
public class RegionsController {

    @Autowired
    private RegionsService regionsService;
//
//    @PostMapping
//    public String save(@Valid @RequestBody RegionsDto dto) {
//        return regionsService.save(dto).toString();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
//        regionsService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") Long id,
//                       @Valid @RequestBody RegionsDto dto) {
//        regionsService.update(id, dto);
//    }

    @GetMapping(value = "/{id}" , produces = "application/json")
    @SneakyThrows
    public ResponseEntity<RegionsDto> getById(@Valid @NotNull @PathVariable("id") String id) {
    	log.info("Init- RegionsController: getById");
    	
    	RegionsDto region = regionsService.getById(id);
    	if( ObjectUtils.isEmpty(region)) {
    		String msg = String.format("Region: %s non trovato",id);
    		
    		log.warn(msg);
    		throw new NotFoundException(msg);
    	}
    	return new ResponseEntity<>(region, HttpStatus.OK);
    }

    @GetMapping(produces = "application/json")
    @SneakyThrows
    public ResponseEntity<List<RegionsDto>> getAllRegions() {
    	log.info("Init- RegionsController: getAllRegions");
    	List<RegionsDto> dtos = regionsService.findAllRegions();
    	
    	if( ObjectUtils.isNotEmpty(dtos)) {
    		log.info(String.format("Region %s: ", dtos));
    		log.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(dtos, HttpStatus.FOUND);
    	}else {
    		String msg = "Region non trovato";
    		
    		log.warn(msg);
    		throw new NotFoundException(msg);
    	}
    }
}
