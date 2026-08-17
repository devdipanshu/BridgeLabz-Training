package org.example.employeepayrollapp.mapper;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.employeepayrollapp.dto.request.RegisterRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@Component
public class EmployeeMapper {

    @Autowired
    private final DepartmentRepository departmentRepository;

    public Employee fromDTO(RegisterRequestDTO registerRequestDTO){
        Employee employee = Employee
                .builder()
                .firstName(registerRequestDTO.getFirstName())
                .lastName(registerRequestDTO.getLastName())
                .joiningDate(registerRequestDTO.getJoiningDate())
                .password(registerRequestDTO.getPassword())
                .username(registerRequestDTO.getUserName())
                .phone(registerRequestDTO.getPhone())
                .role(registerRequestDTO.getRole())
                .build();
        Department department = departmentRepository.findById(registerRequestDTO.getDepartmentId()).orElseThrow();
        employee.setDepartment(department);

        return employee;
    }

    public RegisterResponseDTO toDTO(Employee employee){

        return RegisterResponseDTO.builder()
                .department(employee.getDepartment())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .joiningDate(employee.getJoiningDate())
                .password(employee.getPassword())
                .phone(employee.getPhone())
                .role(employee.getRole())
                .username(employee.getUsername())
                .build();

    }
}
