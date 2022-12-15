package com.jdbc.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
	Statement stmt = conn.createStatement();      // createStatement using this we can get data from table.
//	                             		PreparedStatement();   ....using this we can set,insert,delete,update data into table.			
	ResultSet rs = stmt.executeQuery("select * from userinfo");
	
	while(rs.next()) {
		System.out.print(rs.getString(2)+" ");  //(1) means column no. 1...(2) means column no.2 ...likewise that.
        System.out.println(rs.getString(3));  //(1) means column no. 1...(2) means column no.2 ...likewise that.

//		System.out.println("Krishna".equals( rs.getString(2)));    // it will print Krishna if Krishna is present in rs.getString.
		
//		if("Krishna".equals( rs.getString(1))) {
//			System.out.println("Successfully executed ");   // here if Krishna is present then Krishna and "Krishna & Successfully executed both will execute.
//			break;
		}

		conn.close();
		rs.close();
	
} catch (Exception e) {

	e.printStackTrace();
}	
	}

}
