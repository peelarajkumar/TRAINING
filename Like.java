package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Like {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("select* from students where name like '_a%'");
		while(rt.next()) {
			
			System.out.println(rt.getString(2)+" ");
		}
	}

}
