import java.sql.*;

public class AppointmentService {

    public void bookAppointment(int pid,int did,String date,String time) throws Exception {
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(
                "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?, 'SCHEDULED')");
        ps.setInt(1,pid);
        ps.setInt(2,did);
        ps.setString(3,date);
        ps.setString(4,time);
        ps.executeUpdate();
        con.close();
    }

    public void cancelAppointment(int aid) throws Exception {
        Connection con=DBConnection.getConnection();
        con.setAutoCommit(false);
        PreparedStatement ps1=con.prepareStatement("UPDATE appointments SET status='CANCELLED' WHERE appointment_id=?");
        ps1.setInt(1,aid);
        ps1.executeUpdate();
        PreparedStatement ps2=con.prepareStatement("INSERT INTO appointment_audit VALUES(?,CURRENT_TIMESTAMP)");
        ps2.setInt(1,aid);
        ps2.executeUpdate();
        con.commit();
        con.close();
    }
}
