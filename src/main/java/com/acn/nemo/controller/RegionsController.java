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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.exception.DuplicateException;
import com.acn.nemo.exception.NotFoundException;
import com.acn.nemo.service.RegionsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;



@RestController
@RequestMapping("api/regions")
@Log4j2
@Tag(name = "hrservice" , description = "Controller Operazioni su Region")
public class RegionsController {

    /** The regions service. */
    @Autowired
    private RegionsService regionsService;

    
    
    
    @Operation(summary = "Crea Region" , description = "Ritorna i dati della Region creat in formato JSON", method = "HHTP", tags = {"RegionsDto"} )
    @ApiResponses(value = {
		   			@ApiResponse(responseCode = "201" , description = "Region creata" , 
		   					content = @Content(mediaType = "application/json", schema = @Schema(implementation = RegionsDto.class))),
		   			@ApiResponse(responseCode = "401", description = "Utente non Autenticato", content = @Content),
		   			@ApiResponse(responseCode = "403", description = "Utente non Autorizzato", content = @Content),
					@ApiResponse(responseCode = "404", description = "Regions not found", 
					content = @Content(mediaType = "application/json", schema = @Schema(implementation = DuplicateException.class))) 
		   			}
    			)
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/inserisci", produces = "application/json")
    @SneakyThrows
    public ResponseEntity<RegionsDto> createRegion( @Valid @RequestBody RegionsDto dto) {
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
    @Operation(summary = "Trova Region per ID" , description = "Ritorna i dati della Region per id in formato JSON", method = "HHTP", tags = {"id"} )
    @ApiResponses(value = {
		   			@ApiResponse(responseCode = "200" , description = "Region trovata" , 
		   					content = @Content(mediaType = "application/json", schema = @Schema(implementation = RegionsDto.class))),
		   			@ApiResponse(responseCode = "401", description = "Utente non Autenticato", content = @Content),
		   			@ApiResponse(responseCode = "403", description = "Utente non Autorizzato", content = @Content),
					@ApiResponse(responseCode = "404", description = "Regions not found", 
					content = @Content(mediaType = "application/json", schema = @Schema(implementation = NotFoundException.class))) 
		   			}
    			)
    @GetMapping(value = "/{id}" , produces = "application/json")
    @SneakyThrows
    public ResponseEntity<RegionsDto> getById(@Valid @NotNull @PathVariable("id") String id)  {
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
    @Operation(summary = "Trova tutte le Region" , description = "Ritorna i dati di tutte le Region", method = "HHTP" )
    @ApiResponses(value = {
		   			@ApiResponse(responseCode = "200" , description = "Region trovata" , 
		   					content = @Content(mediaType = "application/json", schema = @Schema(implementation = RegionsDto.class))),
		   			@ApiResponse(responseCode = "401", description = "Utente non Autenticato", content = @Content),
		   			@ApiResponse(responseCode = "403", description = "Utente non Autorizzato", content = @Content),
					@ApiResponse(responseCode = "404", description = "Regions not found", 
					content = @Content(mediaType = "application/json", schema = @Schema(implementation = NotFoundException.class))) 
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
