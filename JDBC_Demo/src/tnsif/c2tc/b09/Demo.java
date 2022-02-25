package tnsif.c2tc.b09;
import java.sql.*; //import the package
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int UID=sc.nextInt();//2100806
		String Name=sc.nextLine();//Jaswanth
		String url="jdbc:mysql://localhost:3306/b09";
		String user="root";
		String pass="H##99k@qirt";
		System.out.println(UID);
		System.out.println(Name);
		//String query="INSERT INTO `b09`.`details` VALUES"
		//	+"("+UID+", "+ Name+");";
		String query="DELETE FROM `b09`.`details` WHERE"
				+"("+UID+", "+Name+");"; 
		Class.forName("com.mysql.cj.jdbc.Driver"); //Resister the driver
		Connection con=DriverManager.getConnection(url,user,pass);// get connection
		Statement st=con.createStatement();// Create statement
		int rs= st.executeUpdate(query);//  Execute query
		System.out.println(" no of rows updated is "+rs);
		st.close();
		con.close();//Close connection

	}

}
