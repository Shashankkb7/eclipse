package com.xworkz.oven.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/alexa","root","Xworkzodc@123");
			//String insertQuery = "insert into microwave_table values(0,'MI',4501,8,'Red',2002)";
			//String deleteQuery="delete from microwave_table where m_id=10";
			String updateQuery="update microwave_table set m_since=2003 WHERE m_id=6";
			Statement statement = connObject.createStatement();
			//int rowsAffected = statement.executeUpdate(insertQuery);
			//int rowsAffected = statement.executeUpdate(deleteQuery);
			int rowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("rowsAffected " + rowsAffected);
			connObject.close();
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException problem loading driver,class anem is wrong " + e.getMessage());
		} catch (SQLException e) {
			System.err.println(
					"SQLException connecting to database,either URL,UserName,Password is wrong " + e.getMessage());
		}
	}

}
