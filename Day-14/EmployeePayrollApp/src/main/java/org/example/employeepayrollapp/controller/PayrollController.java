package org.example.employeepayrollapp.controller;

import jakarta.validation.Valid;
import lombok.Data;
import org.example.employeepayrollapp.dto.request.PayrollRequestDTO;
import org.example.employeepayrollapp.dto.response.PayrollResponseDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Payroll;
import org.example.employeepayrollapp.mapper.PayrollMapper;
import org.example.employeepayrollapp.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "payroll")
@Data
public class PayrollController {

    @Autowired
    private final PayrollService payrollService;
    @Autowired
    private final PayrollMapper payrollMapper;

    @PostMapping("/manager/add")
    public ResponseEntity<PayrollResponseDTO> addPayroll(@Valid @RequestBody PayrollRequestDTO payrollRequestDTO){
        Payroll payroll = payrollMapper.fromDTO(payrollRequestDTO);
        return payrollService.addPayroll(payrollRequestDTO.getEmployeeId(),payroll);
    }
}
