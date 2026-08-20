package org.example.employeepayrollapp.dto.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.employeepayrollapp.entity.Department;
import org.example.employeepayrollapp.entity.Payroll;
import org.example.employeepayrollapp.enums.Role;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponseDTO {
    private String username;

    private String firstName;

    private String lastName;

    private String phone;

    private double salary;

    private LocalDate joiningDate;

    private Role role;

    private Department department;

    private List<Payroll> payroll;

}
