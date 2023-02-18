package com.acn.nemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.acn.nemo.dto.RegionsDto;
import com.acn.nemo.model.Region;

@Mapper(componentModel = "spring", uses= {CountriesMapper.class})
public interface RegionMapper {
	
	
	RegionsDto modelToDto(Region region);
	
	
	Region dtoToModel(RegionsDto regionsDto);


	List<RegionsDto> modelListToDtoList(List<Region> regionList);
	
	void updateModelFromDto(RegionsDto regionsDto, @MappingTarget Region region);

	
}
