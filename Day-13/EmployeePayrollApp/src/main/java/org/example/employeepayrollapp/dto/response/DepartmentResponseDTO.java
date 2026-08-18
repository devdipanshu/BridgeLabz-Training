package org.example.employeepayrollapp.dto.response;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.employeepayrollapp.entity.Employee;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentResponseDTO {

    private long departmentId;

    private String name;

    private String description;

    private List<Employee> employees;

}
