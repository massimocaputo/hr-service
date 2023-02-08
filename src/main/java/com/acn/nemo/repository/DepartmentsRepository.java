package com.acn.nemo.repository;

import com.acn.nemo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentsRepository extends JpaRepository<Department, Long>, JpaSpecificationExecutor<Department> {

}