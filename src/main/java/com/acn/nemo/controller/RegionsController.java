package com.acn.nemo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/regions")
public class RegionsController {

//    @Autowired
//    private RegionsService regionsService;
//
//    @PostMapping
//    public String save(@Valid @RequestBody RegionsDto dto) {
//        return regionsService.save(dto).toString();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
//        regionsService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") Long id,
//                       @Valid @RequestBody RegionsDto dto) {
//        regionsService.update(id, dto);
//    }
//
//    @GetMapping("/{id}")
//    public RegionsDto getById(@Valid @NotNull @PathVariable("id") Long id) {
//        return regionsService.getById(id);
//    }
//
//    @GetMapping
//    public Page<RegionsDto> query(@Valid RegionsDto dto) {
//        return regionsService.query(dto);
//    }
}
