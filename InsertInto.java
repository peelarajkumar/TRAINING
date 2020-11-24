package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertInto {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/mydata";
	String username= "root";
	String password = "root";
	Connection con = DriverManager.getConnection(url, username, password);
	if(con!=null)
	{
		System.out.println("Connection Established");
	}	
	Statement st = con.createStatement();
	
	System.out.println("ENTER THE NO OF CONSUMERS :");
	int num = sc.nextInt();
	 for(int i=0;i<=num;i++) {
		 System.out.println("ENTER THE CUST ID");
		 int id = sc.nextInt();
		 System.out.println("ENTER THE NAME");
		 String name = sc.next();
		 System.out.println("ENTER THE GENDER");
		 String gender = sc.next();
		 
		 //String insert = "insert into consumer values("+id+","+'name'+","+'gen')";
          String insert="insert into consumer values("+id+",'"+name+"',"+gender+")";
          int a = st.executeUpdate(insert);
			if (a != 0)
				System.out.println("inserted");
	 }
	
}
}
