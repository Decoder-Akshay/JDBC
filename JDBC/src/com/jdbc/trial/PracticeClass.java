package com.jdbc.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PracticeClass {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =   DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
			Statement stmt = conn.createStatement();
			ResultSet xx = stmt.executeQuery("select * from userdetail");
			
			while(xx.next()) {
				System.out.print(xx.getString(1)+" ");
				System.out.print(xx.getString(2)+" ");
				System.out.print(xx.getString(3)+" ");
				System.out.println(xx.getString(4)+" ");


			}
			
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
