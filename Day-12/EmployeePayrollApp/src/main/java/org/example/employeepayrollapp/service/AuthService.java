package org.example.employeepayrollapp.service;

import lombok.Data;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
public class AuthService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeMapper employeeMapper;

    public ResponseEntity<RegisterResponseDTO> register(Employee employee){
        Employee employee1 = employeeRepository.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeMapper.toDTO(employee1));
    }
}
