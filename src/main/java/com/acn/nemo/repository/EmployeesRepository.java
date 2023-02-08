package com.acn.nemo.repository;

import com.acn.nemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeesRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

}