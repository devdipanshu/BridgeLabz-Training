package com.example.healthclinicapp.daoimpl;

import com.example.healthclinicapp.config.DatabaseConfig;
import com.example.healthclinicapp.dao.BillingDao;
import com.example.healthclinicapp.dto.Appointment;
import com.example.healthclinicapp.dto.Billing;
import com.example.healthclinicapp.enums.PaymentStatus;
import com.example.healthclinicapp.enums.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillingDaoImpl implements BillingDao {
    DatabaseConfig config = new DatabaseConfig();
    AppointmentDaoImpl appointmentDao = new AppointmentDaoImpl();

    @Override
    public void createBilling(Billing billing){
        String sql = "insert into billing(appointment_id,amount,payment_status,billing_date)" +
                "values(?,?,?,?)";
        try(Connection connection = config.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setInt(1,billing.getAppointment().getAppointmentId());
            preparedStatement.setInt(2,billing.getAmount());
            preparedStatement.setString(3,billing.getPaymentStatus().name());
            preparedStatement.setTimestamp(4,billing.getBillingDate());

            preparedStatement.executeUpdate();

        }
        catch(SQLException e){
            System.out.println("Database Connection failed");
        }
    }

    public List<Billing> getAllBillings(){
        String sql = "select * from billing";
        List<Billing> billings = new ArrayList<>();
        try(
                Connection connection = config.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Billing billing = Billing.builder()
                        .billingDate(Timestamp.valueOf(resultSet.getString("billing_date")))
                        .billingId(resultSet.getInt("bill_id"))
                        .amount(resultSet.getInt("amount"))
                        .paymentStatus(PaymentStatus.valueOf(resultSet.getString("payment_status")))
                        .appointment(appointmentDao.findAppointmentById(resultSet.getInt("appointment_id")))
                        .build();
                billings.add(billing);

            }

        }
        catch(SQLException e){
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
        return billings;
    }

    public Billing findBillingById(int id){
        String sql = "Select * from billing where bill_id = ?";
        Billing billing = null;
        try(
                Connection connection = config.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                billing = Billing.builder()
                        .billingDate(Timestamp.valueOf(resultSet.getString("billing_date")))
                        .billingId(resultSet.getInt("bill_id"))
                        .amount(resultSet.getInt("amount"))
                        .paymentStatus(PaymentStatus.valueOf(resultSet.getString("payment_status")))
                        .appointment(appointmentDao.findAppointmentById(resultSet.getInt("appointment_id")))
                        .build();
            }
        }
        catch(SQLException e){
            System.out.println("Connection failed");
        }
        return billing;
    }

    public void payBillAmount(int id){
        String sql = "update billing set payment_status = ? where bill_id = ?";
        try(Connection connection = config.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,"PAID");
            preparedStatement.setInt(2,id);

            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Connection failed");
        }
    }

    public void refundBillAmount(int id){
        String sql = "update billing set payment_status = ? where bill_id = ?";
        try(Connection connection = config.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,"REFUNDED");
            preparedStatement.setInt(2,id);

            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Connection failed");
        }
    }


}
