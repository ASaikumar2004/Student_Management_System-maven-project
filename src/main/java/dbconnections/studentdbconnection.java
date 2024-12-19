package dbconnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class studentdbconnection {
	private static String Driver="com.mysql.cj.jdbc.Driver";
	private static String username="root";
	private static String password="root";
	private static String url="jdbc:mysql://localhost:3306/studentdashboard";
	private static Connection conn=null;
	public static Connection getConnection() {
		try {
			Class.forName(Driver);
			conn=DriverManager.getConnection(url,username,password);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
