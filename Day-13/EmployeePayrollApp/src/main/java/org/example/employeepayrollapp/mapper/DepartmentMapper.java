package org.example.employeepayrollapp.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.employeepayrollapp.dto.request.DepartmentRequestDTO;
import org.example.employeepayrollapp.dto.response.DepartmentResponseDTO;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.entity.Employee;
import org.example.employeepayrollapp.repository.DepartmentRepository;
import org.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
public class DepartmentMapper {

    @Autowired
    private final DepartmentRepository departmentRepository;
    @Autowired
    private final EmployeeRepository employeeRepository;

    public Department fromDTO(DepartmentRequestDTO departmentRequestDTO){
        Department department = Department.builder()
                .name(departmentRequestDTO.getName())
                .description(departmentRequestDTO.getDescription())
                .build();
        if(departmentRequestDTO.getEmployees()!=null){
            for(Employee e : departmentRequestDTO.getEmployees()){
                department.getEmployees().add(e);
            }
        }
        return department;
    }

    public DepartmentResponseDTO toDTO(Department department){

        return DepartmentResponseDTO.builder()
                .name(department.getName())
                .description(department.getDescription())
                .employees(department.getEmployees())
                .departmentId(department.getDepartmentId())
                .build();
    }
}
