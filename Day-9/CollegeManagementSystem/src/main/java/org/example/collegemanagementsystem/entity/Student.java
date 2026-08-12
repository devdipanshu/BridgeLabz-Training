package org.example.collegemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.collegemanagementsystem.dto.response.StudentResponseDTO;
import org.example.collegemanagementsystem.enums.Gender;
import org.example.collegemanagementsystem.enums.Status;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
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
    private int semester;

    private Date admissionDate;

    private String fatherName;
    private String motherName;
    private String guardianPhone;

    @Enumerated(EnumType.STRING)
    private Status status = Status.NOT_ENROLLED;


    private Timestamp createdAt;
    private Timestamp updatedAt;

    @PrePersist
    public void beforeInserting(){
        this.status = Status.ENROLLED;
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    public void beforeUpdating(){
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    public StudentResponseDTO toDto(Student this){
        return StudentResponseDTO.builder()
                .studentId(this.studentId)
                .firstName(this.firstName)
                .address(this.address)
                .city(this.city)
                .course(this.course)
                .dateOfBirth(this.dateOfBirth)
                .createdAt(this.createdAt)
                .department(this.department)
                .email(this.email)
                .fatherName(this.fatherName)
                .gender(this.gender)
                .guardianPhone(this.guardianPhone)
                .lastName(this.lastName)
                .motherName(this.motherName)
                .phoneNumber(this.phoneNumber)
                .pincode(this.pincode)
                .semester(this.semester)
                .state(this.state)
                .status(this.status)
                .updatedAt(this.updatedAt)
                .build();
    }
}
