package org.example.employeepayrollapp.entity;

import jakarta.persistence.*;

@Entity
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private double basicSalary;

    private double allowance;

    private double deduction;

    private double tax;

    private double netSalary;

    private int payrollMonth;

    private int payrollYear;
}
