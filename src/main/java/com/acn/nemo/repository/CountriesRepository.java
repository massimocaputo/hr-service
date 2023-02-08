package com.acn.nemo.repository;

import com.acn.nemo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountriesRepository extends JpaRepository<Country, String>, JpaSpecificationExecutor<Country> {

}