package tnsif.c2tc.b09;
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/b09";
		String user="root";
		String pass="H##99k@qirt";
		String query="SELECT * FROM b09.details where UID=2100800;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		rs.next();
		System.out.println("UID of the Student is="+rs.getInt(1));
		System.out.println("Name of the Student is="+rs.getString(2));
		st.close();
		con.close();

	}

}
