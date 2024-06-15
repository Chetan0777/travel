package com.travel.service.impl;

import com.travel.entity.Employee;
import com.travel.service.EmployeeService;
import com.travel.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    @Override
    public List<Employee> getEmployees(LocalDate date) {
        return employeeRepository.findByJoiningDate(date, date);
    }
}
