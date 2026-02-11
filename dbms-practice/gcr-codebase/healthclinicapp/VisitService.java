import java.sql.*;

public class VisitService {

    public void recordVisit(int aid,String diagnosis,String notes) throws Exception {
        Connection con=DBConnection.getConnection();
        con.setAutoCommit(false);
        PreparedStatement ps1=con.prepareStatement(
                "INSERT INTO visits(appointment_id,diagnosis,notes) VALUES(?,?,?)");
        ps1.setInt(1,aid);
        ps1.setString(2,diagnosis);
        ps1.setString(3,notes);
        ps1.executeUpdate();
        PreparedStatement ps2=con.prepareStatement(
                "UPDATE appointments SET status='COMPLETED' WHERE appointment_id=?");
        ps2.setInt(1,aid);
        ps2.executeUpdate();
        con.commit();
        con.close();
    }
}
