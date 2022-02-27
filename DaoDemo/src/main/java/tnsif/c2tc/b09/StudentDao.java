package tnsif.c2tc.b09;
import java.sql.*;

public class StudentDao {

	public void addStudent(Student s) throws Exception{
		String url="jdbc:mysql://localhost:3306/b09";
		String user="root";
		String pass="H##99k@qirt";
		String query="INSERT INTO `b09`.`details` VALUES(?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, s.getUID());
		st.setString(2, s.getName());
		int rs=st.executeUpdate();
		System.out.println("No of rows updated is "+rs);
		st.close();
		con.close();


		
	}

}
