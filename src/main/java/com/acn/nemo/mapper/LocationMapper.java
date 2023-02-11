package com.acn.nemo.mapper;

import org.mapstruct.Mapper;

import com.acn.nemo.dto.LocationsDto;
import com.acn.nemo.model.Location;

@Mapper(componentModel = "spring")
public interface LocationMapper {

	LocationsDto modelToDto(Location location);
	
	Location dtoToModel(LocationsDto locationsDto);
}
