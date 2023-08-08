package com.acn.nemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.acn.nemo.model.Region;

/**
 * The Interface RegionsRepository.
 */
public interface RegionRepository extends JpaRepository<Region, Long> {

	
	@Query(value = "SELECT * FROM Region r", nativeQuery = true)
	Integer selAllRegion();
	
	Region findByRegionId(@PathVariable Long idRegion);

}