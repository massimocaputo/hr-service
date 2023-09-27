package com.acn.nemo.repository;

import com.acn.nemo.model.Region;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Interface RegionsRepository.
 */
public interface RegionRepository extends JpaRepository<Region, Long> {

	
	@Query(value = "SELECT REGION_ID, REGION_NAME FROM REGIONS", nativeQuery = true)
	@Transactional(readOnly = true)
	List<Region> selAllRegion();
	
	Region findByRegionId(Long idRegion);

	Region findByRegionNameContainingIgnoreCase(String name);

}