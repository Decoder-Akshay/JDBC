package com.jdbc.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStmt_2 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
			Statement stmt = conn.createStatement();

//			PreparedStatement stmt =  conn.prepareStatement("insert into userdetail(Fname,Lname,salary,city)values(?,?,?,?)");
//			PreparedStatement stmt2 =  conn.prepareStatement("delete  from userdetail where salary=25000");
//			PreparedStatement stmt2 =  conn.prepareStatement("update userdetail set Fname='Prisha' where salary=20000");
    		ResultSet xx = stmt.executeQuery("select * from userdetail");

			while(xx.next()) {
				System.out.print(xx.getString(1)+" ");
				System.out.print(xx.getString(2)+" ");
				System.out.print(xx.getString(3)+" ");
				System.out.println(xx.getString(4)+" ");
			}
//			stmt.setString(1, "Tanuja");
//			stmt.setString(2, "Waghmare");
//			stmt.setString(3, "28000");
//			stmt.setString(4, "Javla");
//			int i=stmt2.executeUpdate();
			
//			int radhe = stmt2.executeUpdate();
//			System.out.println("inserted successfully"+xx);
//			stmt2.close();
			stmt.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
