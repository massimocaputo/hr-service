package com.acn.nemo.mapper;


import org.mapstruct.Mapper;

import com.acn.nemo.dto.CountryDto;
import com.acn.nemo.model.Country;
import org.mapstruct.Mapping;

import java.util.List;

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


	List<CountryDto> countryListToCountryDtos (List<Country> country );
}
