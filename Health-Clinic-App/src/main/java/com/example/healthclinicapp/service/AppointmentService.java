package com.example.healthclinicapp.service;

import com.example.healthclinicapp.dto.Appointment;

import java.util.List;

public interface AppointmentService {

    public void bookAppointment(Appointment appointment);
    public List<Appointment> getAllAppointments();
    public void cancelAppointment(int appointmentId);
    public void markAppointmentSuccessfull(int appointmentId);
    public List<Appointment> viewAllAppointmentByPatient(int patientId);
    public List<Appointment> viewAllAppointmentByDoctor(int doctorId);
    public Appointment findAppointmentById(int id);
}
