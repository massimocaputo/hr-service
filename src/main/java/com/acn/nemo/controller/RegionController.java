package com.acn.nemo.controller;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.model.Region;
import com.acn.nemo.service.RegionsService;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/regions")
@Slf4j
public class RegionController {

	  /** The regions service. */
    @Autowired
    private RegionsService regionsService;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping(value = "/all", produces = "application/json")
	@SneakyThrows
    public ResponseEntity<List<Region>> getAllRegions() {
    	log.info("Init- RegionsController: getAllRegions");
    	List<Region> dtos = regionsService.findAllRegions();
    	
    	if( ObjectUtils.isNotEmpty(dtos)) {
    		log.info(String.format("Region %s: ", dtos));
    		log.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(dtos, HttpStatus.FOUND);
    	}else {
    		String msg = "Region non trovato";
    		
    		log.warn(msg);
    		return new ResponseEntity<>(dtos, HttpStatus.NOT_FOUND);
    		//throw new NotFoundException(msg);
    	}
    }
	
}
