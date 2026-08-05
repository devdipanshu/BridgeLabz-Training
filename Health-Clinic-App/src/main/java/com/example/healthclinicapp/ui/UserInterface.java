package com.example.healthclinicapp.ui;

import com.example.healthclinicapp.dto.Appointment;
import com.example.healthclinicapp.dto.Doctor;
import com.example.healthclinicapp.dto.Patient;
import com.example.healthclinicapp.enums.Gender;
import com.example.healthclinicapp.enums.Specialization;
import com.example.healthclinicapp.enums.Status;
import com.example.healthclinicapp.serviceimpl.AppointmentServiceImpl;
import com.example.healthclinicapp.serviceimpl.DoctorServiceImpl;
import com.example.healthclinicapp.serviceimpl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.SQLException;

@Component
public class UserInterface {

    public static void main(String[] args) {
        PatientServiceImpl patientService = new PatientServiceImpl();
        DoctorServiceImpl doctorService = new DoctorServiceImpl();
        AppointmentServiceImpl appointmentService = new AppointmentServiceImpl();
        Patient p = Patient.builder()
                .name("Ajay")
                .dateOfBirth(Date.valueOf("2011-12-12"))
                .gender(Gender.MALE)
                .address("up")
                .phone("123456798")
                .build();
//        patientService.updatePatientDOB(1,"2012-11-11");
//        patientService.updatePatientAddress(1,"Noida");
//        patientService.updatePatientPhone(1,"98767898767");
////            System.out.println(patientService.viewAllPatient());
////        patientService.updatePatientAge(1,19);
////        System.out.println(patientService.viewAllPatient());
////        System.out.println(patientService.findPatientById(1));
////        patientService.deletePatientById(1);
//        System.out.println(patientService.viewAllPatient());
        Doctor d = Doctor.builder()
                .name("Dr. KP Mishra")
                .email("drkp@gmail.com")
                .phone("987676567")
                .specialization(Specialization.ORTHOPEDIC)
                .build();

//        System.out.println(doctorService.viewAllDoctors());
//        doctorService.updateDoctorName(1,"rahul");
//        doctorService.updateDoctorEmail(1,"abc@gmail.com");
//        doctorService.updateDoctorPhone(1,"87634648");
//        doctorService.deleteDoctorById(1);

        Appointment a = Appointment.builder()
                .patient(patientService.findPatientById(1))
                .doctor(doctorService.findDoctorById(2))
                .appointmentDate(Date.valueOf("2026-08-05"))
                .status(Status.SCHEDULED)
                .build();
//        appointmentService.bookAppointment(a);

        System.out.println(appointmentService.getAllAppointments());
        System.out.println(appointmentService.viewAllAppointmentByPatient(1));
        appointmentService.cancelAppointment(1);
        System.out.println(appointmentService.getAllAppointments());


    }
}
