package com.acn.nemo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.service.RegionsService;

@Validated
@RestController
@RequestMapping("/regions")
public class RegionsController {
	
	private static final Logger logger = LogManager.getLogger(RegionsController.class);

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

    @GetMapping("/{id}")
    public ResponseEntity<RegionsDto> getById(@Valid @NotNull @PathVariable("id") String id) {
    	logger.info("Init- RegionsController: getById");
    	RegionsDto region = regionsService.getById(id);
    	if( ObjectUtils.isNotEmpty(region)) {
    		logger.info("End- RegionsController: getById");
    		return new ResponseEntity<>(region, HttpStatus.FOUND);
    	}else {
    		logger.info("End- RegionsController: getById");
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }

    @GetMapping
    public ResponseEntity<List<RegionsDto>> getAllRegions() {
    	logger.info("Init- RegionsController: getAllRegions");
    	List<RegionsDto> dtos = regionsService.findAllRegions();
    	if( ObjectUtils.isNotEmpty(dtos)) {
    		logger.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(dtos, HttpStatus.FOUND);
    	}else {
    		logger.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }
}
