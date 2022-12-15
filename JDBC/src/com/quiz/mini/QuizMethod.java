package com.quiz.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class QuizMethod{
	int count = 0;

	public void m1() {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root123");
		Statement stmt = conn.createStatement();
		
		ResultSet xx = stmt.executeQuery("select * from quest");
		
		while(xx.next()) {
			
//			System.out.print(xx.getString(1)+" ");
//			System.out.println(xx.getString(2)+" ");
			System.out.println(xx.getString(3)+" ");
			System.out.println("A) "+xx.getString(4)+" ");
			System.out.println("B) "+xx.getString(5)+" ");
			System.out.println("C) "+xx.getString(6)+" ");
			System.out.println("D) "+xx.getString(7)+" ");

			System.out.println("Enter answer ");
			Scanner scnr = new Scanner(System.in);
			String s=scnr.nextLine();
		
			String str =xx.getString("Ans");
			if(s.equals(str) ) {
//				System.out.println("true");
			count++;
			}else {
//				System.out.println("False");       //int id = rs.getInt("id");
			}
			}
		System.out.println("Total marks are " +count);	
		conn.close();
			stmt.close();	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
}
