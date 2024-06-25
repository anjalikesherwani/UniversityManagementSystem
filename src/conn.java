import java.sql.*;

public class conn {

	
	conn() {

	}

	public static void main(String[] args) throws ClassNotFoundException , SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
//		<--------------database connection--------------->
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/universitymanagementsystem","root","");
		System.out.println("connected" + c);
		
		//<---------------created database----------------->
//		Statement st = c.createStatement();
//		st.executeUpdate("create database universitymanagementsystem");
//		System.out.println("created database");
		
		//<---------------table created------------------->
//		String sql = "create table login(username varchar(30) primary key, password varchar(30))";
//		Statement st = c.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("table created");
		
//		<-----------------data inserted----------------->
		String sql = "insert into login values ('admin','12345')";
		Statement st = c.createStatement();
		st.executeUpdate(sql);
		System.out.println("data inserted!!");
		
//		String deleteQuery = "Drop database universitymanagementsystem";
//		Statement st = c.createStatement();
//		st.executeUpdate(deleteQuery);
//		System.out.println("Database deleted Successfully");	

		

	}

}
