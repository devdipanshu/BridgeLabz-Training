package org.example.employeepayrollapp.controller;

import jakarta.validation.Valid;
import lombok.Data;
import org.example.employeepayrollapp.dto.request.RegisterRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.mapper.EmployeeMapper;
import org.example.employeepayrollapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
@Data
public class AuthController {

    @Autowired
    private final EmployeeMapper employeeMapper;
    @Autowired
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(@Valid RegisterRequestDTO registerRequestDTO){
        Employee employee = employeeMapper.fromDTO(registerRequestDTO);
        return authService.register(employee);
    }

}
