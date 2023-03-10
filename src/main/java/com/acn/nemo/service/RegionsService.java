package com.acn.nemo.service;

import java.util.List;

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
	 * @return the regions dto
	 * @throws NotFoundException the not found exception
	 */
	RegionsDto inserisci(RegionsDto dto) throws NotFoundException;

	/**
	 * Gets the by description.
	 *
	 * @param regionName the region name
	 * @return the by description
	 */
	RegionsDto getByDescription(String regionName);


    
}
