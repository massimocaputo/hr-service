package com.acn.nemo.repository;

import com.acn.nemo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LocationsRepository extends JpaRepository<Location, Long>, JpaSpecificationExecutor<Location> {

}