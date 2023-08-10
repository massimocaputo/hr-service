package com.acn.nemo.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.acn.nemo.dtos.RegionDto;
import com.acn.nemo.model.Region;

@Mapper( uses=CountryMapper.class)
public interface RegionMapper {

	//RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);
	
	@Mapping(source = "region.regionId" , target = "id")
	RegionDto regionToRegionDto (Region region);
	
	@InheritInverseConfiguration
	Region regionDtoToRegion (RegionDto regionDto);
	
	List<RegionDto> regionListToRegionDtos (List<Region> regions );
}
