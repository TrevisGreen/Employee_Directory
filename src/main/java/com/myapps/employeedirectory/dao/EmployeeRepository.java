package com.myapps.employeedirectory.dao;

import com.myapps.employeedirectory.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // That's it ... no more code for now!!

    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
