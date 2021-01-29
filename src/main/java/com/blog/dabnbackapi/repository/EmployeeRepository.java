package com.blog.dabnbackapi.repository;

import com.blog.dabnbackapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
