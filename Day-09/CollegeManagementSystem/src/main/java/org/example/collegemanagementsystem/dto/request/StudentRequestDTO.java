package org.example.collegemanagementsystem.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.collegemanagementsystem.enums.Gender;
import org.example.collegemanagementsystem.enums.Status;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRequestDTO {
    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Pincode is required")
    private String pincode;

    @NotBlank(message = "Course is required")
    private String course;

    @NotBlank(message = "Department is required")
    private String department;

    @NotNull(message = "Semester is required")
    private Integer semester;

    @NotBlank(message = "Father name is required")
    private String fatherName;

    @NotBlank(message = "Mother name is required")
    private String motherName;

    @NotBlank(message = "Guardian phone is required")
    private String guardianPhone;

    private Status status;

    private Date admissionDate;
}

