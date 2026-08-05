package com.example.healthclinicapp.serviceimpl;

import com.example.healthclinicapp.dao.AppointmentDao;
import com.example.healthclinicapp.daoimpl.AppointmentDaoImpl;
import com.example.healthclinicapp.dto.Appointment;
import com.example.healthclinicapp.service.AppointmentService;

import java.util.List;

public class AppointmentServiceImpl implements AppointmentService {
    AppointmentDao appointmentDao = new AppointmentDaoImpl();

    @Override
    public void bookAppointment(Appointment appointment){
        appointmentDao.bookAppointment(appointment);
    }
    @Override
    public List<Appointment> getAllAppointments(){
        return appointmentDao.getAllAppointments();
    }
    @Override
    public void cancelAppointment(int appointmentId){
        appointmentDao.cancelAppointment(appointmentId);
    }
    @Override
    public void markAppointmentSuccessfull(int appointmentId){
        appointmentDao.markAppointmentSuccessfull(appointmentId);
    }
    @Override
    public List<Appointment> viewAllAppointmentByPatient(int patientId){
        return appointmentDao.viewAllAppointmentByPatient(patientId);
    }
    @Override
    public List<Appointment> viewAllAppointmentByDoctor(int doctorId){
        return appointmentDao.viewAllAppointmentByDoctor(doctorId);
    }
    @Override
    public Appointment findAppointmentById(int id){
        return appointmentDao.findAppointmentById(id);
    }
}
