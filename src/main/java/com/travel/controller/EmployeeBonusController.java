package com.travel.controller;


import com.travel.entity.Employee;
import com.travel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EmployeeBonusController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/employee-bonus")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> employee) {
        employeeService.saveEmployees(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee saved successfully");
    }

    @GetMapping("/employee-bonus")
    public ResponseEntity<?> getEmployees(@RequestParam("date") String date) {
            List<Employee> eligibleEmployees = employeeService.getEmployees(LocalDate.parse(date));
            return ResponseEntity.ok(eligibleEmployees);
    }
}
