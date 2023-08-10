package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dtos.CountryDto;
import com.acn.nemo.model.Country;
import org.mapstruct.Mapping;

/**
 * The Interface CountryMapper.
 */
@Mapper(uses = {LocationMapper.class})
public interface CountryMapper {

	
	/**
	 * Country to country dto.
	 *
	 * @param country the country
	 * @return the country dto
	 */
	CountryDto countryToCountryDto (Country country );

	/**
	 * Country dto to country.
	 *
	 * @param countryDto the country dto
	 * @return the country
	 */
	@Mapping(target = "region", ignore = true)
	Country countryDtoToCountry (CountryDto countryDto );
}
