package com.myapps.employeedirectory.service;

import com.myapps.employeedirectory.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void delete(int theId);
}
