package com.acn.nemo.controller;

import com.acn.nemo.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/jobs")
public class JobsController {

    @Autowired
    private JobsService jobsService;

//    @PostMapping
//    public String save(@Valid @RequestBody JobsDto dto) {
//        return jobsService.save(dto).toString();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@Valid @NotNull @PathVariable("id") String id) {
//        jobsService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public void update(@Valid @NotNull @PathVariable("id") String id,
//                       @Valid @RequestBody JobsDto dto) {
//        jobsService.update(id, dto);
//    }
//
//    @GetMapping("/{id}")
//    public JobsDto getById(@Valid @NotNull @PathVariable("id") String id) {
//        return jobsService.getById(id);
//    }
//
//    @GetMapping
//    public Page<JobsDto> query(@Valid JobsDto dto) {
//        return jobsService.query(dto);
//    }
}
