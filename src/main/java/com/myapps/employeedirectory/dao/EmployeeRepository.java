package com.myapps.employeedirectory.dao;

import com.myapps.employeedirectory.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // That's it ... no more code for now!!
}
