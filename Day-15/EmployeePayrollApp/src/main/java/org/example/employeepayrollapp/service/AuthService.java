package org.example.employeepayrollapp.service;

import org.example.employeepayrollapp.dto.request.LoginRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    public ResponseEntity<RegisterResponseDTO> register(Employee employee);
    public ResponseEntity<String> login(LoginRequestDTO loginRequestDTO);
}
