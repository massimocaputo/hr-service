package com.acn.nemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.nemo.dtos.RegionDto;
import com.acn.nemo.mapper.RegionMapper;
import com.acn.nemo.model.Region;
import com.acn.nemo.repository.RegionRepository;
import com.acn.nemo.service.RegionService;

import lombok.extern.log4j.Log4j2;

/**
 * The Class RegionServiceImpl.
 */
@Service
@Transactional(readOnly = true)

/** The Constant log. */

/** The Constant log. */

/** The Constant log. */
@Log4j2
public class RegionServiceImpl implements RegionService {
	
	
	/** The region repository. */
	@Autowired
	private RegionRepository regionRepository;
	
	/** The region mapper. */
	@Autowired
	private RegionMapper regionMapper;



	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	@Override
	public List<RegionDto> findAllRegions() {
		log.info("Init- RegionsServiceImpl: findAllRegions");
		return regionMapper.regionListToRegionDtos(regionRepository.findAll());
	}



	/**
	 * Retrive region.
	 *
	 * @param id the id
	 * @return the region
	 */
	@Override
	public Region retriveRegion(Long id) {
		return regionRepository.findByRegionId(id);
	}



	/**
	 * Sel all region.
	 *
	 * @return the list
	 */
	@Override
	public List<Region> selAllRegion() {
		return regionRepository.selAllRegion();
	}



	/**
	 * Gets the region name.
	 *
	 * @param name the name
	 * @return the region name
	 */
	@Override
	public Region getRegionName(String name) {
		return regionRepository.findByRegionNameContainingIgnoreCase(name);
	}


	


}
