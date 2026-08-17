package org.example.employeepayrollapp.repository;

import org.example.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    Employee findByUsername(String username);
}
