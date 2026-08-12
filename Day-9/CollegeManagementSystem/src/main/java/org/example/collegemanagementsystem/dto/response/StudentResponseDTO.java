package org.example.collegemanagementsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.collegemanagementsystem.enums.Gender;
import org.example.collegemanagementsystem.enums.Status;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponseDTO {

    private Long studentId;

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

    private String course;
    private String department;
    private Integer semester;

    private String fatherName;
    private String motherName;
    private String guardianPhone;

    private Status status;

    private Timestamp createdAt;
    private Timestamp updatedAt;
}