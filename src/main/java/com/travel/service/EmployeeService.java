package com.travel.service;

import com.travel.entity.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {

    void saveEmployees(List<Employee> employees);
    List<Employee> getEmployees(LocalDate date);


}
