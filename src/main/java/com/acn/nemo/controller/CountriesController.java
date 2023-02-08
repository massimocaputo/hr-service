package com.acn.nemo.controller;

import com.acn.nemo.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/countries")
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

//    @PostMapping
//    public String save(@Valid @RequestBody CountriesDto dto) {
//        return countriesService.save(dto).toString();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") String id) {
//        countriesService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") String id,
//                       @Valid @RequestBody CountriesDto dto) {
//        countriesService.update(id, dto);
//    }
//
//    @GetMapping("/{id}")
//    public CountriesDto getById(@Valid @NotNull @PathVariable("id") String id) {
//        return countriesService.getById(id);
//    }
//
//    @GetMapping
//    public Page<CountriesDto> query(@Valid CountriesDto dto) {
//        return countriesService.query(dto);
//    }
}
