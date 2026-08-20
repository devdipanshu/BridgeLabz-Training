package org.example.employeepayrollapp.service;

import org.example.employeepayrollapp.dto.request.UpdateRequestDTO;
import org.example.employeepayrollapp.dto.response.PayrollResponseDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    public ResponseEntity<RegisterResponseDTO> getEmployeeById(Long id);
    public ResponseEntity<List<RegisterResponseDTO>> getAllEmployees();
    public ResponseEntity<RegisterResponseDTO> getEmployeeByUsername(String username);
    public ResponseEntity<List<RegisterResponseDTO>> getEmployeesByDepartmentName(String departmentName);
    public ResponseEntity<RegisterResponseDTO> updateUserDetails(Long employeeId, UpdateRequestDTO updateRequestDTO);
    public ResponseEntity<List<PayrollResponseDTO>> getAllPayrolls(Long id);
    public void promoteToManager(long id);
}
