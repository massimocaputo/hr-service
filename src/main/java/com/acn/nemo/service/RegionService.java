package com.acn.nemo.service;

import java.util.List;

import com.acn.nemo.model.Region;

/**
 * The Interface RegionsService.
 */
public interface RegionService {

	

	/** The sel all region. */
	List<Region> selAllRegion();

	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	List<Region> findAllRegions();

	/**
	 * Retrive region.
	 *
	 * @param id the id
	 * @return the region
	 */
	Region retriveRegion(Long id);

	
	/**
	 * Gets the region name.
	 *
	 * @param name the name
	 * @return the region name
	 */
	Region getRegionName(String name);



    
}
