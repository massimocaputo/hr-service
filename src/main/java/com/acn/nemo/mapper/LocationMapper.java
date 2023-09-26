package com.acn.nemo.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.acn.nemo.dto.LocationDto;
import com.acn.nemo.model.Location;

/**
 * The Interface LocationMapper.
 */
@Mapper(uses = DepartmentMapper.class)
public interface LocationMapper {

	
	/**
	 * Location to location dto.
	 *
	 * @param location the location
	 * @return the location dto
	 */
	@Mapping(source="departments", target = "departmentDtos")
	LocationDto locationToLocationDto (Location location);

	/**
	 * Location dto to location.
	 *
	 * @param locationDto the location dto
	 * @return the location
	 */
	@Mapping(target = "country", ignore = true)
	@InheritInverseConfiguration
	Location locationDtoToLocation (LocationDto locationDto);
	
	/**
	 * Locations to location dto.
	 *
	 * @param locations the locations
	 * @return the list
	 */
	List<LocationDto> locationsToLocationDtos (List<Location> locations);
}
