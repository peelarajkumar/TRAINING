package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnections {
public static void main(String[] args) throws ClassNotFoundException, Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url ="jdbc:mysql://localhost:3306/mydata";
	String username = "root";
	String password = "root";
	Connection con = DriverManager.getConnection(url, username, password);
	if(con!=null)
	{
		System.out.println("Connection Established");
	}	
	 Statement st = con.createStatement();
	int x= st.executeUpdate("insert into student values(1030,'Rin',82,'A','O+ve',17,'DAV')");
	 if(x!=0) {
		 System.out.println("Record enetered");
	 }
	 ResultSet rs = st.executeQuery("select* from student");
	 while(rs.next())
	 {
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		 
	 }
}
}
