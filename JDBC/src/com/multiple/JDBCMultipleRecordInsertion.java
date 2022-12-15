package com.multiple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMultipleRecordInsertion {

	Connection conn= null;
	PreparedStatement ps = null ;
	
	public void insertData() {
		
//	public static void main(String[] args) {
		try {
//			Connection conn = new ConnectionClass();
			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
			PreparedStatement  stmt = conn.prepareStatement("update userproducts set productname=?,productBrand");
			
			PreparedStatement  stmt2 = conn.prepareStatement("update userproducts set productId=? ,productname=? ,productBrand");

//			stmt.setString(1,"1" );    // here 1 means ? question mark is present at which number.i.e. productId=? is 1.
			stmt.setString(1,"Cotton");                                     //   i.e. productname=? is 2.  and  i.e. productbrand=? is 3.
			stmt.setString(2,"Raymond");
			
			int rr = stmt.executeUpdate();
			System.out.println("updated successfully "+rr);

			conn.close();
			stmt.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
