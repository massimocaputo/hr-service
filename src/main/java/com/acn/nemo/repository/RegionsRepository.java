package com.acn.nemo.repository;

import com.acn.nemo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * The Interface RegionsRepository.
 */
public interface RegionsRepository extends JpaRepository<Region, Long>, JpaSpecificationExecutor<Region> {

}