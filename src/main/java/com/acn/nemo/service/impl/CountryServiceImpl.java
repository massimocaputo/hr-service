package com.acn.nemo.service.impl;

import com.acn.nemo.config.RegionConfig;
import com.acn.nemo.dto.CountryDto;
import com.acn.nemo.mapper.CountryMapper;
import com.acn.nemo.repository.CountryRepository;
import com.acn.nemo.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
@Slf4j
public class CountryServiceImpl implements CountryService {


    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private RegionConfig regionConfig;


    private List<CountryDto> countryDtos;

    /**
     * @return
     */
    @Override
    public List<CountryDto> getListCountryDto() {
        countryDtos = countryMapper.countryListToCountryDtos(countryRepository.findAll());
        return countryDtos;
    }
}
