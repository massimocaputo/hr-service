package com.acn.nemo.config;

import com.acn.nemo.dto.RegionDto;
import com.acn.nemo.dto.RegionInitDto;
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

    private List<RegionInitDto> regionInitDtoList;

    @Bean
    public List<RegionInitDto> retriveRegionBeanDto(){
        log.info("Init- RegionConfig");

        regionInitDtoList = regionService.findAllRegionInitDto();
        log.info("List<RegionInitDto>: "+ regionInitDtoList);

        return regionInitDtoList;
    }
}
