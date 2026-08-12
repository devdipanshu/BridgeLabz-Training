package org.example.collegemanagementsystem.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.collegemanagementsystem.enums.Gender;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacultyRequestDTO {

    @NotBlank(message = "First name cannot be empty")
    private String firstName;

    private String lastName;

    @NotNull(message = "Gender cannot be null")
    private Gender gender;

    @NotNull(message = "Date of birth cannot be null")
    private Date dateOfBirth;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "It should be in Email Format")
    private String email;

    @NotBlank(message = "Phone number cannot be empty")
    private String phoneNumber;

    private String address;

    private String city;

    private String state;

    private String pincode;

    @NotBlank(message = "Department cannot be empty")
    private String department;

    @NotBlank(message = "Designation cannot be empty")
    private String designation;

    @NotBlank(message = "Qualification cannot be empty")
    private String qualification;

    @NotNull(message = "Joining date cannot be null")
    private Date joiningDate;

    private String experience;

    private Double salary;
}