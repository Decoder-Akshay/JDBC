package com.jdbc.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSetStringDmo {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
//	PreparedStatement stmt = conn.prepareStatement("insert into userinfo(UserId,FirstName,LastName)values(?,?,?)");
//	PreparedStatement stmt = conn.prepareStatement("delete from userinfo where UserId=10");
	
	PreparedStatement  stmt = conn.prepareStatement("update userinfo set UserId=? ,FirstName=? ,LastName=?");
	PreparedStatement  stmt2 = conn.prepareStatement("update userinfo set UserId=? ,FirstName=? ,LastName=?");
//
//	stmt.setString(1,"12");
//	stmt.setString(2,"Tanaji");
//	stmt.setString(3,"Dev");
	
	stmt2.setString(1,"13");
	stmt2.setString(2,"radha");
	stmt2.setString(3,"rani");
	
	int i1=stmt2.executeUpdate();

//	int i=stmt.executeUpdate();
	System.out.println("Data updated "+i1);

//System.out.println("Data updated "+i);

	stmt.close();
	conn.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
