package com.acn.nemo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.exception.DuplicateException;
import com.acn.nemo.exception.NotFoundException;
import com.acn.nemo.service.RegionsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;


/**
 * The Class RegionsController.
 */
@RestController
@RequestMapping("api/regions")

/** The Constant log. */

/** The Constant log. */
@Log4j2
@Api(value = "hrservice" , tags = "Controller Operazioni su Region")
public class RegionsController {

    /** The regions service. */
    @Autowired
    private RegionsService regionsService;

    /**
     * Creates the region.
     *
     * @param dto the dto
     * @return the response entity
     */
    @ApiOperation(
   		 value = "Crea Region",
   		 notes = "Ritorna i dati della Region in formato JSON",
   		 response = RegionsDto.class,
   		 produces = "application/json"
   		)
   @ApiResponses(value = 
				{
					@ApiResponse(code = 404 , message = "Region non trovato"),
					@ApiResponse(code = 201 , message = "Region creata")
				}
   		) 
    @PostMapping(value = "/inserisci", produces = "application/json")
    @SneakyThrows
    public ResponseEntity<RegionsDto> createRegion(@ApiParam(value = "RegionDto") @Valid @RequestBody RegionsDto dto) {
    	log.info("Salviamo Region con codice " + dto.getRegionName());
    	 
    	RegionsDto trovato = regionsService.getByDescription(dto.getRegionName());
    	if(ObjectUtils.isNotEmpty(trovato)) {
    		throw new DuplicateException("Risorsa Duplicata");
    	}
    	RegionsDto regionCreated =  regionsService.inserisci(dto);
         
         return new ResponseEntity<>( regionCreated,HttpStatus.CREATED);
    }


    /**
     * Gets the by id.
     *
     * @param id the id
     * @return the by id
     */
    @ApiOperation(
    		 value = "Ricerca Region per Id",
    		 notes = "Ritorna i dati della Region in formato JSON",
    		 response = RegionsDto.class,
    		 produces = "application/json"
    		)
    @ApiResponses(value = 
				{
					@ApiResponse(code = 404 , message = "Region non trovato"),
					@ApiResponse(code = 200 , message = "Region trovato")
				}
    		)    
    @GetMapping(value = "/{id}" , produces = "application/json")
    @SneakyThrows
    public ResponseEntity<RegionsDto> getById(@ApiParam(value = "Id Region Univoco") @Valid @NotNull @PathVariable("id") String id)  {
    	log.info("Init- RegionsController: getById");
    	
    	RegionsDto region = regionsService.getById(id);
    	if( ObjectUtils.isEmpty(region)) {
    		String msg = String.format("Region: %s non trovato",id);
    		
    		log.warn(msg);
    		throw new NotFoundException(msg);
    	}
    	return new ResponseEntity<>(region, HttpStatus.OK);
    }

    /**
     * Gets the all regions.
     *
     * @return the all regions
     */
    @ApiOperation(
   		 value = "Ricerca All Region",
   		 notes = "Ritorna tutti i dati delle Region in formato JSON",
   		 response = RegionsDto.class,
   		 produces = "application/json"
   		)
   @ApiResponses(value = 
				{
					@ApiResponse(code = 404 , message = "Region non trovato"),
					@ApiResponse(code = 200 , message = "Region trovato"),
					@ApiResponse(code = 302 , message = "Region gi&agrave; presente")
				}
   		)
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
