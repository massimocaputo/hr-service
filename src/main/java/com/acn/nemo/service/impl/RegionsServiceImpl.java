package com.acn.nemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.exception.NotFoundException;
import com.acn.nemo.mapper.RegionMapper;
import com.acn.nemo.model.Region;
import com.acn.nemo.repository.RegionsRepository;
import com.acn.nemo.service.RegionsService;

import lombok.extern.log4j.Log4j2;

/**
 * The Class RegionsServiceImpl.
 */
@Service
@Transactional(readOnly = true)

/** The Constant log. */
@Log4j2
public class RegionsServiceImpl implements RegionsService {
	
	
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
		log.info("INIT getById");
		Optional<Region> valueRegion = regionsRepository.findById(Long.valueOf(id));
		if( valueRegion.isPresent()) {
			log.info(String.format("Region %s found", valueRegion.get().getRegionName()));
			log.info("END getById");
			return regionMapper.modelToDto(valueRegion.get());
		}		
		log.info("END getById");
		return null;
	}


	/**
	 * Find all regions.
	 *
	 * @return the list
	 */
	@Override
	public List<RegionsDto> findAllRegions() {
		log.info("Init- RegionsServiceImpl: findAllRegions");
		return regionMapper.modelListToDtoList(regionsRepository.findAll());
	}


	/**
	 * Inserisci.
	 *
	 * @param dto the dto
	 * @throws NotFoundException 
	 */
	@Override
	@Transactional
	public RegionsDto inserisci(RegionsDto dto) throws NotFoundException {
		log.info("Init- RegionsServiceImpl: inserisci");
		Integer maxId = regionsRepository.findByMaxId();
		log.info("MaxID: " + maxId);
		dto.setRegionId(String.valueOf(maxId+1));
		Region reg = regionsRepository.save( regionMapper.dtoToModel(dto) );		
		log.info("End- RegionsServiceImpl: inserisci");
		return regionMapper.modelToDto(reg);
	}


	@Override
	public RegionsDto getByDescription(String regionName) {
		log.info("Init- RegionsServiceImpl: getByDescription");
		RegionsDto dto = regionMapper.modelToDto(regionsRepository.findByRegionName(regionName));
		log.info("End- RegionsServiceImpl: getByDescription");
		return dto;
	}


}
