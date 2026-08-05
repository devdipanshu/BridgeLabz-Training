package com.example.healthclinicapp.dto;

import com.example.healthclinicapp.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {
    private int appointmentId;
    private Date appointmentDate;
    private Status status;
    private Patient patient;
    private Doctor doctor;
}
