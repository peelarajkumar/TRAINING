package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseCon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydata";
		String username= "root";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY TWO  QUERIES");
		String q = sc.nextLine();
		String p = sc.nextLine();
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		st.executeUpdate(q);
		st.executeUpdate(p);
		//st.executeUpdate("insert into employee values(1011,'SAMMY','20,000')");
		//st.executeUpdate("insert into employee values(1013,'JAMMY','60,000')");
		ResultSet rs = st.executeQuery("select* from employee");
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}

}
