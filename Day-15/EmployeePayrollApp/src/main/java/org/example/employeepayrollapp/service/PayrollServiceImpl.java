package org.example.employeepayrollapp.service;

import lombok.Data;
import org.example.employeepayrollapp.dto.response.PayrollResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.entity.Payroll;
import org.example.employeepayrollapp.mapper.PayrollMapper;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.example.employeepayrollapp.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Data
public class PayrollServiceImpl implements PayrollService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final PayrollRepository payrollRepository;
    @Autowired
    private final PayrollMapper payrollMapper;


    @Override
    @Transactional
    public ResponseEntity<PayrollResponseDTO> addPayroll(long empId, Payroll payroll) {

        Employee employee = employeeRepository.findById(empId)
                .orElseThrow();

        System.out.println("OLD SALARY = " + employee.getSalary());
        System.out.println("NEW SALARY = " + payroll.getBasicSalary());

        employee.setSalary(payroll.getBasicSalary());

        employeeRepository.save(employee);

        payroll.setEmployee(employee);
        employee.getPayrolls().add(payroll);

        Payroll payroll1 = payrollRepository.save(payroll);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(payrollMapper.toDTO(payroll1));
    }

}
