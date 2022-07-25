package com.gcet.util;

import java.sql.DriverManager;
import java.sql.Connection;
public class DBUtil {
	
	public static Connection getDBConnection() {
		Connection con =null;
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
//			System.out.println("Established");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		System.out.println("connected");
		return con;
	}

}
