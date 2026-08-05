package com.example.healthclinicapp.daoimpl;

import com.example.healthclinicapp.config.DatabaseConfig;
import com.example.healthclinicapp.dao.AppointmentDao;
import com.example.healthclinicapp.dto.Appointment;
import com.example.healthclinicapp.enums.Status;
import com.example.healthclinicapp.service.DoctorService;
import com.example.healthclinicapp.service.PatientService;
import com.example.healthclinicapp.serviceimpl.DoctorServiceImpl;
import com.example.healthclinicapp.serviceimpl.PatientServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDaoImpl implements AppointmentDao {
    DatabaseConfig databaseConfig = new DatabaseConfig();
    PatientService patientService = new PatientServiceImpl();
    DoctorService doctorService = new DoctorServiceImpl();

    @Override
    public void bookAppointment(Appointment appointment){
        String sql = "Insert into appointment(patient_id,doctor_id,appointment_date,status)" +
                "values(?,?,?,?)";
        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            preparedStatement.setInt(1,appointment.getPatient().getPatientId());
            preparedStatement.setInt(2,appointment.getDoctor().getDoctorId());
            preparedStatement.setDate(3,appointment.getAppointmentDate());
            preparedStatement.setString(4,appointment.getStatus().name());

            preparedStatement.executeUpdate();

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
    @Override
    public List<Appointment> getAllAppointments(){
        String sql = "select * from appointment";
        List<Appointment> appointments = new ArrayList<>();
        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Appointment appointment = Appointment.builder()
                        .appointmentId(resultSet.getInt("appointment_id"))
                        .patient(patientService.findPatientById(resultSet.getInt("patient_id")))
                        .doctor(doctorService.findDoctorById(resultSet.getInt("doctor_id")))
                        .appointmentDate(Date.valueOf(resultSet.getString("appointment_date")))
                        .status(Status.valueOf(resultSet.getString("status")))
                        .build();
                appointments.add(appointment);

            }

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
        return appointments;
    }
    @Override
    public void cancelAppointment(int appointmentId){
        String sql = "update appointment set status = ? where appointment_id = ?";

        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setString(1,"CANCELLED");
            preparedStatement.setInt(2,appointmentId);

            preparedStatement.executeUpdate();

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }

    }
    @Override
    public void markAppointmentSuccessfull(int appointmentId){
        String sql = "update appointment set status = ? where appointment_id = ?";
        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setString(1,"COMPLETED");
            preparedStatement.setInt(2,appointmentId);

            preparedStatement.executeUpdate();

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }

    }
    @Override
    public List<Appointment> viewAllAppointmentByPatient(int patientId){
        String sql = "select * from appointment where patient_id = ?";
        List<Appointment> appointments = new ArrayList<>();
        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){

            preparedStatement.setInt(1,patientId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Appointment appointment = Appointment.builder()
                        .appointmentId(resultSet.getInt("appointment_id"))
                        .patient(patientService.findPatientById(resultSet.getInt("patient_id")))
                        .doctor(doctorService.findDoctorById(resultSet.getInt("doctor_id")))
                        .appointmentDate(Date.valueOf(resultSet.getString("appointment_date")))
                        .status(Status.valueOf(resultSet.getString("status")))
                        .build();
                appointments.add(appointment);

            }

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
        return appointments;
    }
    @Override
    public List<Appointment> viewAllAppointmentByDoctor(int doctorId){
        String sql = "select * from appointment where doctor_id = ?";
        List<Appointment> appointments = new ArrayList<>();
        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){

            preparedStatement.setInt(1,doctorId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Appointment appointment = Appointment.builder()
                        .appointmentId(resultSet.getInt("appointment_id"))
                        .patient(patientService.findPatientById(resultSet.getInt("patient_id")))
                        .doctor(doctorService.findDoctorById(resultSet.getInt("doctor_id")))
                        .appointmentDate(Date.valueOf(resultSet.getString("appointment_date")))
                        .status(Status.valueOf(resultSet.getString("status")))
                        .build();
                appointments.add(appointment);

            }

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
        return appointments;
    }
    @Override
    public Appointment findAppointmentById(int id){
        String sql = "Select * from appointment where appointment_id = ?";
        Appointment appointment = null;
        try(
                Connection connection = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                appointment = Appointment.builder()
                        .appointmentId(resultSet.getInt("appointment_id"))
                        .patient(patientService.findPatientById(resultSet.getInt("patient_id")))
                        .doctor(doctorService.findDoctorById(resultSet.getInt("doctor_id")))
                        .appointmentDate(Date.valueOf(resultSet.getString("appointment_date")))
                        .status(Status.valueOf(resultSet.getString("status")))
                        .build();
            }
        }
        catch(SQLException e){
            System.out.println("Connection failed");
        }
        return appointment;
    }
}
