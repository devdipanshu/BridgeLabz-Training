package org.example.employeepayrollapp.service;

import org.example.employeepayrollapp.dto.response.DepartmentResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepartmentService {
    public ResponseEntity<List<DepartmentResponseDTO>> getAllDepartment();
    public ResponseEntity<DepartmentResponseDTO> addDepartment(Department department);
}
