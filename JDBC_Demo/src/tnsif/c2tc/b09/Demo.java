package tnsif.c2tc.b09;
import java.sql.*; //import the package
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String Name=sc.nextLine();//Jaswanth
		int UID=sc.nextInt();//2100806
		
		String url="jdbc:mysql://localhost:3306/b09";
		String user="root";
		String pass="H##99k@qirt";
		System.out.println(UID);
		System.out.println(Name);
		//INSERT query
		//String query="INSERT INTO `b09`.`details` VALUES"+"("+UID+", "+ Name+");";
		//DELETE query
		//String query="DELETE FROM `details` WHERE (`UID` = '123');";
	     //UPDATE query
		String query="UPDATE `details` SET `Name` = 'Harshitha' WHERE (`UID` = '2100805');";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //Resister the driver
		Connection con=DriverManager.getConnection(url,user,pass);// get connection
		Statement st=con.createStatement();// Create statement
		int rs= st.executeUpdate(query);//  Execute query
		System.out.println(" no of rows updated is "+rs);
		st.close();
		con.close();//Close connection

	}
}
		
		
	    /*String url="jdbc:mysql://localhost:3306/b09";
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
		con.close();*/



