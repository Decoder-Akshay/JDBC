package com.multiple;

import java.sql.Connection;
import java.sql.DriverManager;

public class CollectionClass {

	Connection conn= null;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}
		
		
	

}
