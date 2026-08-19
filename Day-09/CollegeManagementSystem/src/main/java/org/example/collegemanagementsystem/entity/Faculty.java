package org.example.collegemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.collegemanagementsystem.dto.response.FacultyResponseDTO;
import org.example.collegemanagementsystem.enums.Gender;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyId;

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

    private String department;
    private String designation;
    private String qualification;

    private Date joiningDate;

    private String experience;
    private Double salary;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    @PrePersist
    public void beforeInserting(){
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    public void beforeUpdating(){
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    public FacultyResponseDTO toDto() {

        return FacultyResponseDTO.builder()
                .facultyId(facultyId)
                .firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .dateOfBirth(dateOfBirth)
                .email(email)
                .phoneNumber(phoneNumber)
                .address(address)
                .city(city)
                .state(state)
                .pincode(pincode)
                .department(department)
                .designation(designation)
                .qualification(qualification)
                .joiningDate(joiningDate)
                .experience(experience)
                .salary(salary)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}
