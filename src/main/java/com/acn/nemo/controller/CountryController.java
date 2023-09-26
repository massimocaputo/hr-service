package com.acn.nemo.controller;

import com.acn.nemo.config.RegionConfig;
import com.acn.nemo.dto.CountryDto;
import com.acn.nemo.service.CountryService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/country")

/** The Constant log. */
@Slf4j
public class CountryController {

    @Autowired
    private RegionConfig regionConfig;
    @Autowired
    private CountryService countryService;


    @GetMapping(value = "/all", produces = "application/json")
    @SneakyThrows
    public ResponseEntity<List<CountryDto>> getAllCountries(){
        log.info("Init- CountryController: getAllCountries");
        log.info("List<RegionDto>: "+ regionConfig.getRegionDtos());

        List<CountryDto> countryDtos = countryService.getListCountryDto();
        log.info("List<CountryDto>: "+ countryDtos);
        if( ObjectUtils.isNotEmpty(countryDtos)) {
            log.info(String.format("Country %s: ", countryDtos));
            log.info("End- CountryController: getAllCountries");
            return new ResponseEntity<>(countryDtos, HttpStatus.FOUND);
        }else {
            String msg = "Country non trovato";
            log.warn(msg);
            return new ResponseEntity<>(countryDtos, HttpStatus.NOT_FOUND);
        }
    }
}
