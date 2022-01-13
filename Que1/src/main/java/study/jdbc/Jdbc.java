package study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public Connection makeConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
				System.out.println("Driver class not locate");
		}
		
		String url = "jdbc:mysql://localhost:3306/que1";
		String user="root";
		String pass="Abhi@651165";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
				System.out.println("connection failed");
		}
		
		return con;
	}
	
	public void add(String date, String task)
	{
		Connection connect = makeConnection();
		try {
			Statement stmt = connect.createStatement();
			String sql = "INSERT INTO USER planner_info_tbl(date,task) values('"+date+"','"+task+"')";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
