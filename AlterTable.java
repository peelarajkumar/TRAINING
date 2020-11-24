package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlterTable {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int x = st.executeUpdate("alter table employee rename employees");
		ResultSet rt = st.executeQuery("select* from employees");
		
		while(rt.next()) {
			
			System.out.println(rt.getString(2));
		}
		

	}

}
