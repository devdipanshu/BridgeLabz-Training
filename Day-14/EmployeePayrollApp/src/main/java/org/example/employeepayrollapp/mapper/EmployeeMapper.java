package org.example.employeepayrollapp.mapper;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.employeepayrollapp.dto.request.RegisterRequestDTO;
import org.example.employeepayrollapp.dto.response.RegisterResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@Component
@Slf4j
public class EmployeeMapper {

    @Autowired
    private final DepartmentRepository departmentRepository;
    @Autowired
    private final EmployeeRepository employeeRepository;

    public Employee fromDTO(RegisterRequestDTO registerRequestDTO){
        log.info("from dto m aa gya");
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
//        department.getEmployees().add(employee);
//        departmentRepository.save(department);
//        Employee e = employeeRepository.save(employee);

        log.info("from dto se jane wala h");

        return employee;
    }

    public RegisterResponseDTO toDTO(Employee employee){

        return RegisterResponseDTO.builder()
                .department(employee.getDepartment())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .joiningDate(employee.getJoiningDate())
                .phone(employee.getPhone())
                .role(employee.getRole())
                .username(employee.getUsername())
                .payroll(employee.getPayrolls())
                .salary(employee.getSalary())
                .build();

    }
}
