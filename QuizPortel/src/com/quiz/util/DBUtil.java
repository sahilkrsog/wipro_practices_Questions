package com.quiz.util;
import java.sql.DriverManager;
import java.sql.Connection;
import java.lang.Exception;
public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
			System.out.println("Established");
			
			
		
		}catch(Exception e) {System.out.println(e);}
		return con;
		
	}




}
