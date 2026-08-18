package org.example.employeepayrollapp.repository;

import org.example.employeepayrollapp.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll,Long> {
}
