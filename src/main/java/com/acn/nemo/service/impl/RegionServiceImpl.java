package com.acn.nemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.nemo.dtos.RegionDto;
import com.acn.nemo.mapper.RegionMapper;
import com.acn.nemo.repository.RegionRepository;
import com.acn.nemo.service.RegionService;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

/**
 * The Class RegionServiceImpl.
 */
@Service
@Transactional(readOnly = true)

/** The Constant log. */

/** The Constant log. */

/** The Constant log. */
@Slf4j
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
	public RegionDto retriveRegion(Long id) {
		log.info(String.format("INIT - retriveRegion: %s", id));
		return regionMapper.regionToRegionDto( regionRepository.findByRegionId(id) );
	}



	/**
	 * Sel all region.
	 *
	 * @return the list
	 */
	@Override
	public List<RegionDto> selAllRegion() {
		log.info("INIT - selAllRegion");
		return regionMapper.regionListToRegionDtos(regionRepository.selAllRegion());
	}



	/**
	 * Gets the region name.
	 *
	 * @param name the name
	 * @return the region name
	 */
	@Override
	public RegionDto getRegionName(String name) {
		log.info(String.format("INIT - getRegionName: %s", name));
		return regionMapper.regionToRegionDto(regionRepository.findByRegionNameContainingIgnoreCase(name) );
	}


	


}
