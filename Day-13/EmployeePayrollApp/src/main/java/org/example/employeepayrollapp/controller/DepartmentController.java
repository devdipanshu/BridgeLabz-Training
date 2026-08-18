package org.example.employeepayrollapp.controller;

import jakarta.validation.Valid;
import lombok.Data;
import org.example.employeepayrollapp.dto.request.DepartmentRequestDTO;
import org.example.employeepayrollapp.dto.response.DepartmentResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.mapper.DepartmentMapper;
import org.example.employeepayrollapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "department")
@Data
public class DepartmentController {

    @Autowired
    private final DepartmentService departmentService;
    @Autowired
    private final DepartmentMapper departmentMapper;

    @GetMapping("/all")
    public ResponseEntity<List<DepartmentResponseDTO>> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    @PostMapping("/add")
    public ResponseEntity<DepartmentResponseDTO> addDepartment(@Valid @RequestBody DepartmentRequestDTO departmentRequestDTO){

        Department department = departmentMapper.fromDTO(departmentRequestDTO);
        return departmentService.addDepartment(department);
    }
}
