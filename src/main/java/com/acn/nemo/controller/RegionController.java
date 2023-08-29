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

import com.acn.nemo.dtos.RegionDto;
import com.acn.nemo.service.RegionService;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * The Class RegionController.
 */
@RestController
@RequestMapping("v1/regions")

/** The Constant log. */
@Slf4j
public class RegionController {

	  /** The regions service. */
    @Autowired
    private RegionService regionService;
		
    
	/**
	 * Gets the all regions.
	 *
	 * @return the all regions
	 */
	@GetMapping(value = "/all", produces = "application/json")
	@SneakyThrows
    public ResponseEntity<List<RegionDto>> getAllRegions() {
    	log.info("Init- RegionsController: getAllRegions");
    	List<RegionDto> regionsDtos = regionService.findAllRegions();
    	
    	if( ObjectUtils.isNotEmpty(regionsDtos)) {
    		log.info(String.format("Region %s: ", regionsDtos));
    		log.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(regionsDtos, HttpStatus.FOUND);
    	}else {
    		String msg = "Region non trovato";
    		log.warn(msg);
    		return new ResponseEntity<>(regionsDtos, HttpStatus.NOT_FOUND);
    	}
    }
	
	@GetMapping(value = "/sel", produces = "application/json")
	@SneakyThrows
    public ResponseEntity<List<RegionDto>> selAllRegions() {
    	log.info("Init- RegionsController: getAllRegions");
    	List<RegionDto> regionsDtos = regionService.selAllRegion();
    	
    	if( ObjectUtils.isNotEmpty(regionsDtos)) {
    		log.info(String.format("Region %s: ", regionsDtos));
    		log.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(regionsDtos, HttpStatus.FOUND);
    	}else {
    		String msg = "Region non trovato";
    		log.warn(msg);
    		return new ResponseEntity<>(regionsDtos, HttpStatus.NOT_FOUND);
    	}
    }
	
	
	/**
	 * Retrive region.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@GetMapping("/{id}")
	@SneakyThrows
	public ResponseEntity<RegionDto> retriveRegion(@PathVariable("id") Long id){
		log.info("Init- RegionsController: retriveRegion");
		RegionDto reg = regionService.retriveRegion(id);
		log.info("RegionDto: "+ reg.toString());
		if( ObjectUtils.isNotEmpty(reg)){
			log.info("END- RegionsController: retriveRegion");
			return new ResponseEntity<>(reg, HttpStatus.FOUND);
		}else{
			String msg = "Region non trovato";
			log.info(String.format("END- RegionsController: %s " , msg));
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	/**
	 * Region name.
	 *
	 * @param name the name
	 * @return the response entity
	 */
	@GetMapping(path="/name/{name}")
	@SneakyThrows
	public ResponseEntity<RegionDto> regionName(@PathVariable String name){
		log.info("Init- RegionsController: regionName");
		RegionDto region = regionService.getRegionName(name);
    	
    	if( ObjectUtils.isNotEmpty(region)) {
    		log.info(String.format("Region %s: ", region));
    		log.info("End- RegionsController: getAllRegions");
    		return new ResponseEntity<>(region, HttpStatus.FOUND);
    	}else {
    		String msg = "Region non trovato";
    		log.warn(msg);
    		return new ResponseEntity<>(region, HttpStatus.NOT_FOUND);
    	}
	}
	
}
