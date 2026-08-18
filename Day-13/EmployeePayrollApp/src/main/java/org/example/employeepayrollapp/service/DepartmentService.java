package org.example.employeepayrollapp.service;

import lombok.Data;
import org.example.employeepayrollapp.dto.response.DepartmentResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.mapper.DepartmentMapper;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@RequestMapping(path = "department")
public class DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final DepartmentMapper departmentMapper;

    public ResponseEntity<List<DepartmentResponseDTO>> getAllDepartment(){
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentResponseDTO> departmentResponseDTOS = new ArrayList<>();

        for(Department key: departments){
            departmentResponseDTOS.add(
                    departmentMapper.toDTO(key)
            );
        }

        return ResponseEntity.status(HttpStatus.OK).body(departmentResponseDTOS);
    }

    public ResponseEntity<DepartmentResponseDTO> addDepartment(Department department){
        Department department1 = null;
        if(department.getEmployees()==null || department.getEmployees().isEmpty()){
            department1 = departmentRepository.save(department);
            return ResponseEntity.status(HttpStatus.CREATED).body(departmentMapper.toDTO(department1));
        }

        for(Employee emp : department.getEmployees()){
            emp.setDepartment(department);
            employeeRepository.save(emp);
        }
        department1 = departmentRepository.save(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentMapper.toDTO(department1));

    }

}
