import java.sql.*;

public class PatientService {

    public void registerPatient(String name,String dob,String phone,String email,String address,String blood) throws Exception {
        Connection con=DBConnection.getConnection();
        String sql="INSERT INTO patients(name,dob,phone,email,address,blood_group) SELECT ?,?,?,?,?,? WHERE NOT EXISTS(SELECT 1 FROM patients WHERE phone=? OR email=?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,dob);
        ps.setString(3,phone);
        ps.setString(4,email);
        ps.setString(5,address);
        ps.setString(6,blood);
        ps.setString(7,phone);
        ps.setString(8,email);
        ps.executeUpdate();
        con.close();
    }

    public void updatePatient(int id,String name,String phone) throws Exception {
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("UPDATE patients SET name=?,phone=? WHERE patient_id=?");
        ps.setString(1,name);
        ps.setString(2,phone);
        ps.setInt(3,id);
        ps.executeUpdate();
        con.close();
    }

    public void searchPatient(String key) throws Exception {
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("SELECT * FROM patients WHERE name LIKE ? OR phone=?");
        ps.setString(1,"%"+key+"%");
        ps.setString(2,key);
        ResultSet rs=ps.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        con.close();
    }
}
