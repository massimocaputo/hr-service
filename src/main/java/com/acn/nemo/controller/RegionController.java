package com.acn.nemo.controller;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.model.Region;
import com.acn.nemo.service.RegionService;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("v1/regions")
@Slf4j
public class RegionController {

	  /** The regions service. */
    @Autowired
    private RegionService regionService;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping(value = "/all", produces = "application/json")
	@SneakyThrows
    public ResponseEntity<List<Region>> getAllRegions() {
    	log.info("Init- RegionsController: getAllRegions");
    	List<Region> regions = regionService.findAllRegions();
    	
    	if( ObjectUtils.isNotEmpty(regions)) {
    		log.info(String.format("Region %s: ", regions));
    		log.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(regions, HttpStatus.FOUND);
    	}else {
    		String msg = "Region non trovato";
    		log.warn(msg);
    		return new ResponseEntity<>(regions, HttpStatus.NOT_FOUND);
    	}
    }
	
	@GetMapping("/{id}")
	@SneakyThrows
	public ResponseEntity<Region> retriveRegion(@PathVariable Long id){
		log.info("Init- RegionsController: retriveRegion");
		Region reg = regionService.retriveRegion(id);
		if( ObjectUtils.isNotEmpty(reg)){
			log.info("END- RegionsController: retriveRegion");
			return new ResponseEntity<>(reg, HttpStatus.FOUND);
		}else{
			String msg = "Region non trovato";
			log.info(String.format("END- RegionsController: %s " , msg));
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
}
