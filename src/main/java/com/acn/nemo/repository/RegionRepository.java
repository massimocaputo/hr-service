package com.acn.nemo.repository;

import com.acn.nemo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * The Interface RegionsRepository.
 */
public interface RegionRepository extends JpaRepository<Region, Long> {

	
	@Query(value = "SELECT * FROM Region r", nativeQuery = true)
	Integer selAllRegion();
	
	Region findByRegionId(Long idRegion);

}