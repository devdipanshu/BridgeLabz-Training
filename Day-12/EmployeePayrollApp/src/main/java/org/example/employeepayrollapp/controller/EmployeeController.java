package org.example.employeepayrollapp.controller;

import lombok.Data;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Data
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<RegisterResponseDTO> getEmployeeById(@PathVariable(name = "id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping()
    public ResponseEntity<List<RegisterResponseDTO>> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{username}")
    public ResponseEntity<RegisterResponseDTO> getEmployeeByUsername(@PathVariable(name = "username") String username){
        return employeeService.getEmployeeByUsername(username);
    }


}
