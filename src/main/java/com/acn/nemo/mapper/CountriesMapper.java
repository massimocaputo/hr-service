package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.CountryDto;
import com.acn.nemo.model.Country;

@Mapper(componentModel = "spring")
public interface CountriesMapper {

    CountryDto modelToDto(Country countries);

    Country dtoToToModel(CountryDto countriesDto);

}
