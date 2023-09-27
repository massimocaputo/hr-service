package com.acn.nemo.service;

import java.util.List;

import com.acn.nemo.dto.RegionDto;
import com.acn.nemo.dto.RegionInitDto;

/**
 * The Interface RegionService.
 */
public interface RegionService {

	

	/**
	 * Sel all region.
	 *
	 * @return the list
	 */
	List<RegionDto> selAllRegion();

	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	List<RegionInitDto> findAllRegionInitDto();

	List<RegionDto> findAllRegions();

	List<RegionDto> findRegions();

	/**
	 * Retrive region.
	 *
	 * @param id the id
	 * @return the region dto
	 */
	RegionDto retriveRegion(Long id);

	
	/**
	 * Gets the region name.
	 *
	 * @param name the name
	 * @return the region name
	 */
	RegionDto getRegionName(String name);



    
}
