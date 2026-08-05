package com.example.healthclinicapp.dao;

import com.example.healthclinicapp.dto.Appointment;

import java.util.List;

public interface AppointmentDao {
    public void bookAppointment(Appointment appointment);
    public List<Appointment> getAllAppointments();
    public void cancelAppointment(int appointmentId);
    public void markAppointmentSuccessfull(int appointmentId);
    public List<Appointment> viewAllAppointmentByPatient(int patientId);
    public List<Appointment> viewAllAppointmentByDoctor(int doctorId);
    public Appointment findAppointmentById(int id);
}
