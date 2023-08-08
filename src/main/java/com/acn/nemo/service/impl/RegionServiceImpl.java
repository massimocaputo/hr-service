package com.acn.nemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.nemo.model.Region;
import com.acn.nemo.repository.RegionRepository;
import com.acn.nemo.service.RegionService;

import lombok.extern.log4j.Log4j2;

/**
 * The Class RegionsServiceImpl.
 */
@Service
@Transactional(readOnly = true)

/** The Constant log. */
@Log4j2
public class RegionServiceImpl implements RegionService {
	
	
	/** The regions repository. */
	@Autowired
	private RegionRepository regionRepository;
	


	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	@Override
	public List<Region> findAllRegions() {
		log.info("Init- RegionsServiceImpl: findAllRegions");
		return regionRepository.findAll();
	}



	@Override
	public Region retriveRegion(Long id) {
		regionRepository.findByRegionId(id)
		return null;
	}


	


}
