package com.JNIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JoinTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		//int x = st.exe("select a.cid,a.name,a.item,a.quant,b.cid,b.price from client a , shipment b where a.cid=b.cid");
		ResultSet rst = st.executeQuery("select a.cid,a.name,a.item,a.quan,b.cid,b.price from client a , shipment b where a.cid=b.cid");
		while(rst.next()) {
			
			System.out.println(rst.getInt(1)+"   "+rst.getString(2)+"   "+rst.getString(3)+"   "+rst.getInt(4)+"   "+rst.getInt(5));
		}
	}

}
