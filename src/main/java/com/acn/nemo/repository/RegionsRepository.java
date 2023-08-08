package com.acn.nemo.repository;

import com.acn.nemo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * The Interface RegionsRepository.
 */
public interface RegionsRepository extends JpaRepository<Region, Long>, JpaSpecificationExecutor<Region> {

	
	@Query(value = "SELECT coalesce(max(regionId), 0) FROM Region r")
	Integer findByMaxId();

}