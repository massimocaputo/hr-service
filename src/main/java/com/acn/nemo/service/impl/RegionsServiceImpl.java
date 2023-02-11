package com.acn.nemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.mapper.RegionMapper;
import com.acn.nemo.model.Region;
import com.acn.nemo.repository.RegionsRepository;
import com.acn.nemo.service.RegionsService;

/**
 * The Class RegionsServiceImpl.
 */
@Service
public class RegionsServiceImpl implements RegionsService {
	
	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(RegionsServiceImpl.class);
	
	/** The regions repository. */
	@Autowired
	private RegionsRepository regionsRepository;
	
	/** The region mapper. */
	@Autowired
	private RegionMapper regionMapper;
	
	
	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	@Override
	public RegionsDto getById(String id) {
		Optional<Region> valueRegion = regionsRepository.findById(Long.valueOf(id));
		if( valueRegion.isPresent()) {
			return regionMapper.modelToDto(valueRegion.get());
		}		
		return null;
	}


	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	@Override
	public List<RegionsDto> findAllRegions() {
		logger.info("Init- RegionsServiceImpl: findAllRegions");
		return regionMapper.modelListToDtoList(regionsRepository.findAll());
	}

}
