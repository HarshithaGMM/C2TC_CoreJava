package tnsif.c2tc.b09;
import java.sql.*; //import the package
public class demo1 {

	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/b09";
		String user="root";
		String pass="H##99k@qirt";
		String query="SELECT * FROM b09.details;";
		Class.forName("com.mysql.cj.jdbc.Driver"); //Resister the driver
		Connection con=DriverManager.getConnection(url,user,pass);// get connection
		Statement st=con.createStatement();// Create statement
		ResultSet rs= st.executeQuery(query);//  Execute query
		while(rs.next()) //process statement
		{
		System.out.println("UID of the Student is="+rs.getInt(1));
		System.out.println("Name of the Student is="+rs.getString(2));
		}
		st.close();
		con.close();//Close connection
	}
}
