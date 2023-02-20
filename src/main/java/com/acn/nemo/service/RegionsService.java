package com.acn.nemo.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.exception.NotFoundException;

/**
 * The Interface RegionsService.
 */
public interface RegionsService {

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	RegionsDto getById(String id);

	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	List<RegionsDto> findAllRegions();

	/**
	 * Inserisci.
	 *
	 * @param dto the dto
	 * @throws NotFoundException 
	 */
	void inserisci(RegionsDto dto) throws NotFoundException;

	RegionsDto getByDescription(String regionName);


    
}
