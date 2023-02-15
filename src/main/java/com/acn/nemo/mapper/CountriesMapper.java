package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.CountryDto;
import com.acn.nemo.model.Country;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses= {LocationMapper.class} )
public interface CountriesMapper {

    CountryDto modelToDto(Country countries);

    
	@Mapping(target = "region", ignore = true)
	Country dtoToToModel(CountryDto countriesDto);

}
