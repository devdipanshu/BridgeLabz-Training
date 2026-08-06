package com.example.healthclinicapp.dto;

import com.example.healthclinicapp.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Billing {
    private int billingId;
    private Appointment appointment;
    private int amount;
    private PaymentStatus paymentStatus;
    private Timestamp billingDate;
}
