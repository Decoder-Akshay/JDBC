package com.jdbc.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcScannerClass {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn =  	DriverManager.getConnection("jdbc:mysql://localhost:3306/trialschema","root","root@18");
//PreparedStatement stmt = conn.prepareStatement("insert into userdetail(Fname,Lname,salary,city)values(?,?,?,?)");
PreparedStatement stmt = conn.prepareStatement("update userdetail set Fname='Radharani',city='Barsana' where salary=98888"); // here Fname= 'Radharani' we have to take ' ' this single colon with Radharani.
PreparedStatement stmt2 = conn.prepareStatement("update userdetail set Fname='Ladali',city='Vrindavan' where salary=20000");   

//PreparedStatement stmt = conn.prepareStatement("delete from userdetail  where salary='90000'");

//Scanner scnr = new Scanner(System.in);
//System.out.println("Enter a first name ");
//String Fname = scnr.nextLine();

//System.out.println("Enter a last name ");
//String Lname = scnr.nextLine();

//System.out.println("Enter a salary name ");
//String salary = scnr.nextLine();

//System.out.println("Enter a city name ");
//String city = scnr.nextLine();

//stmt.setString(1, "Fname");
//stmt.setString(2, "Lname");
//stmt.setString(3, "98888");
//stmt.setString(4, "city");

int rr = stmt2.executeUpdate();
	int rr1 = stmt.executeUpdate();
	System.out.println("Inserted value"+rr);

	System.out.println("Inserted value"+rr1);
	conn.close();
    stmt.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
