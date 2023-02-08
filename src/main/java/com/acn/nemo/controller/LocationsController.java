package com.acn.nemo.controller;

import com.acn.nemo.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/locations")
public class LocationsController {

    @Autowired
    private LocationsService locationsService;

//    @PostMapping
//    public String save(@Valid @RequestBody LocationsDto dto) {
//        return locationsService.save(dto).toString();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
//        locationsService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") Long id,
//                       @Valid @RequestBody LocationsDto dto) {
//        locationsService.update(id, dto);
//    }
//
//    @GetMapping("/{id}")
//    public LocationsDto getById(@Valid @NotNull @PathVariable("id") Long id) {
//        return locationsService.getById(id);
//    }
//
//    @GetMapping
//    public Page<LocationsDto> query(@Valid LocationsDto dto) {
//        return locationsService.query(dto);
//    }
}
