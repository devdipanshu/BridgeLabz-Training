import java.sql.*;

public class DoctorService {

    public void addDoctor(String name,int specialty,String contact,double fee) throws Exception {
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(
                "INSERT INTO doctors(name,specialty_id,contact,consultation_fee) VALUES(?,?,?,?)");
        ps.setString(1,name);
        ps.setInt(2,specialty);
        ps.setString(3,contact);
        ps.setDouble(4,fee);
        ps.executeUpdate();
        con.close();
    }

    public void deactivateDoctor(int doctorId) throws Exception {
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(
                "UPDATE doctors SET is_active=false WHERE doctor_id=? AND NOT EXISTS(SELECT 1 FROM appointments WHERE doctor_id=? AND appointment_date>CURRENT_DATE)");
        ps.setInt(1,doctorId);
        ps.setInt(2,doctorId);
        ps.executeUpdate();
        con.close();
    }
}
