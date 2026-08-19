package org.example.collegemanagementsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.collegemanagementsystem.enums.Gender;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacultyResponseDTO {

    private Long facultyId;

    private String firstName;

    private String lastName;

    private Gender gender;

    private Date dateOfBirth;

    private String email;

    private String phoneNumber;

    private String address;

    private String city;

    private String state;

    private String pincode;

    private String department;

    private String designation;

    private String qualification;

    private Date joiningDate;

    private String experience;

    private Double salary;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}