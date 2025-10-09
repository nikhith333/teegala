package jdbcprogram.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbcprogram.dao.DBUtil;

public class CurdOperations {
	static Connection con;
	static PreparedStatement pst;
	
	static {
		con=DBUtil.getConnection();
		if(con!=null)
		{
			System.out.println("connection is success");
		}
	}
	
	//created the table now we have to add the values to table
	public static int addStudent(int sid,String sname)
	{
		int n=0;
		try {
			pst = con.prepareStatement("INSERT INTO student VALUES(?,?)");
			pst.setInt(1, sid);
			pst.setString(2, sname);
			pst.executeUpdate();
		}catch(Exception e)
		{
			
		}
		return n;
	}
	
	//  Update Student Name
	public static int updateStudent(int sid, String newName) {
        int n = 0;
        try {
            pst = con.prepareStatement("UPDATE student SET sname = ? WHERE sid = ?");
            pst.setString(1, newName);
            pst.setInt(2, sid);
            n = pst.executeUpdate();
            if (n > 0)
                System.out.println("🔄 Updated successfully for ID: " + sid);
            else
                System.out.println("⚠️ No record found with ID: " + sid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
	
	//  Delete Student
    public static int deleteStudent(int sid) {
        int n = 0;
        try {
            pst = con.prepareStatement("DELETE FROM student WHERE sid = ?");
            pst.setInt(1, sid);
            n = pst.executeUpdate();
            if (n > 0)
                System.out.println("🗑️ Deleted record with ID: " + sid);
            else
                System.out.println("⚠️ No record found with ID: " + sid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    //  Display All Students
    public static void displayStudents() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("\n📋 Student Records:");
            System.out.println("-----------------------");
            while (rs.next()) {
                int id = rs.getInt("sid");
                String name = rs.getString("sname");
                System.out.println("ID: " + id + " | Name: " + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
}