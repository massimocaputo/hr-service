package com.acn.nemo.service;

import java.util.List;

import com.acn.nemo.dto.RegionsDto;

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

    
}
