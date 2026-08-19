package org.example.employeepayrollapp.repository;

import org.example.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    Employee findByUsername(String username);


    List<Employee> findAllByDepartment_Name(String departmentName);
}
