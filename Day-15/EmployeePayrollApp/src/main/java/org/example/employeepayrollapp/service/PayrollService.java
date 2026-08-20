package org.example.employeepayrollapp.service;

import org.example.employeepayrollapp.dto.response.PayrollResponseDTO;
import org.example.employeepayrollapp.entity.Payroll;
import org.springframework.http.ResponseEntity;

public interface PayrollService {
    public ResponseEntity<PayrollResponseDTO> addPayroll(long empId, Payroll payroll);
}
