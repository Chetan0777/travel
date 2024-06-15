package com.travel.repo;

import com.travel.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByJoiningDate(LocalDate joiningDate, LocalDate exitDate);


}
