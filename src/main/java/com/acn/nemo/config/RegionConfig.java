package com.acn.nemo.config;

import com.acn.nemo.dto.RegionDto;
import com.acn.nemo.mapper.RegionMapper;
import com.acn.nemo.service.RegionService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
@Slf4j
@Getter
@Setter
public class RegionConfig {

    @Autowired
    private RegionMapper regionMapper;

    @Autowired
    private RegionService regionService;

    private List<RegionDto> regionDtos;

    @Bean
    public List<RegionDto> retriveRegionBeanDto(){
        log.info("Init- RegionConfig");

        regionDtos = regionService.findAllRegions();
        log.info("List<RegionDto>: "+ regionDtos);

        return regionDtos;
    }
}
