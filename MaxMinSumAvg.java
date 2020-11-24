package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MaxMinSumAvg {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("select max(marks) , min(marks),avg(marks),sum(marks)from student");
		while(rt.next()) {
			System.out.println("MAX  MIN  AVG   SUM ");	
			System.out.println(rt.getInt(1)+"   "+rt.getInt(2)+"   "+rt.getInt(3)+"    "+rt.getInt(4));
		}
		
		
		
	}

}
