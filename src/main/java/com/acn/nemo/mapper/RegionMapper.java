package com.acn.nemo.mapper;

import java.util.List;

import com.acn.nemo.dto.RegionInitDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.acn.nemo.dto.RegionDto;
import com.acn.nemo.model.Region;

@Mapper( uses=CountryMapper.class)
public interface RegionMapper {

	RegionDto regionToRegionDto (Region region);

	@InheritInverseConfiguration
	Region regionDtoToRegion (RegionDto regionDto);
	
	List<RegionDto> regionListToRegionDtos (List<Region> regions );

	List<RegionInitDto> regionListToRegionInitDto (List<Region> regions );
}
