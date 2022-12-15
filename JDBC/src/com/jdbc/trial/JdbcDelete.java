package com.jdbc.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {   // Here we used prepareStatement . so with prepareStatement DML command works i.e. delete,update,insert,select

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
			PreparedStatement stmt=conn.prepareStatement("delete from userdetail where salary=?");
			
			stmt.setString(1,"15000" );   // here from userdetail abhishek 15000 deleted
			int rr = stmt.executeUpdate();
		System.out.println(rr);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
