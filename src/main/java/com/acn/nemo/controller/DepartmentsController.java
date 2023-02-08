package com.acn.nemo.controller;

import com.acn.nemo.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/departments")
public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;

//    @PostMapping
//    public String save(@Valid @RequestBody DepartmentsDto dto) {
//        return departmentsService.save(dto).toString();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
//        departmentsService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") Long id,
//                       @Valid @RequestBody DepartmentsDto dto) {
//        departmentsService.update(id, dto);
//    }
//
//    @GetMapping("/{id}")
//    public DepartmentsDto getById(@Valid @NotNull @PathVariable("id") Long id) {
//        return departmentsService.getById(id);
//    }
//
//    @GetMapping
//    public Page<DepartmentsDto> query(@Valid DepartmentsDto dto) {
//        return departmentsService.query(dto);
//    }
}
