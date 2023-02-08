package com.acn.nemo.mapper;

import com.acn.nemo.dto.CountriesDto;
import com.acn.nemo.model.Country;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountriesMapper {

    CountriesMapper INSTANCE = Mappers.getMapper(CountriesMapper.class);

    CountriesDto modelToDto(Country countries);

    Country dtoToToModel(CountriesDto countriesDto);

}
