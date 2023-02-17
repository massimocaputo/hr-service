package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.CountryDto;
import com.acn.nemo.model.Country;

/**
 * The Interface CountriesMapper.
 */
@Mapper(componentModel = "spring")
public interface CountriesMapper {

    /**
     * Model to dto.
     *
     * @param countries the countries
     * @return the country dto
     */
    CountryDto modelToDto(Country countries);

    /**
     * Dto to to model.
     *
     * @param countriesDto the countries dto
     * @return the country
     */
    Country dtoToToModel(CountryDto countriesDto);
	
    
}
