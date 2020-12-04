package com.dummypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientClass extends HttpServlet {
	
	Connection con;
	PreparedStatement ps;
	public void init(ServletConfig config)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydata";
			String username ="root";
			String password ="root";
			try {
				 con =DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id = req.getParameter("id");
			int did = Integer.parseInt(id);
			String name = req.getParameter("name");
			String age = req.getParameter("age");
			String phno = req.getParameter("phno");
			String email = req.getParameter("email");
			String address = req.getParameter("address");
			String gender = req.getParameter("gender");
			String sql = "insert into patient values(?,?,?,?,?,?,?)";
			PrintWriter pw = resp.getWriter();
			try {
				ps=con.prepareStatement(sql);
				ps.setInt(1,did);
				ps.setString(2,name);
				ps.setString(3, age);
				ps.setString(4, phno);
				ps.setString(5, email);
				ps.setString(6, address);
				ps.setString(7, gender);
				int x=ps.executeUpdate();
				pw.println("<html> <body bgcolor= 'wheat'>");
				if(x==1) {
					
					pw.println("   PATIENT REGISTERED SUCCESSFULLY   ");
					pw.println("</body></html>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
