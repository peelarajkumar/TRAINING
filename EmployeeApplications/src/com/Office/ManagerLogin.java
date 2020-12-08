package com.Office;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ManagerLogin extends HttpServlet {
	Connection con;
	PreparedStatement ps;
	public void init(ServletConfig config)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/application";
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
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String email = req.getParameter("email");
			String password = req.getParameter("name");
			String name = req.getParameter("name");
			PrintWriter pw = resp.getWriter();
			String sql = "select * from manager where email=? and name=?";
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1, email);
				ps.setString(2, password);
				HttpSession hs = req.getSession();
				ResultSet rs =ps.executeQuery();
				pw.println("<html> <body bgcolor= 'wheat'><center><h1>");
				if(rs.next()) {
					hs.setAttribute("semail", email);
					hs.setAttribute("name", name);
					resp.sendRedirect("./manager_home.html? msg=LOGIN SUCCESSFULL");
					
				}
				else {
					resp.sendRedirect("./man_reg.html? msg LOGIN FAILED");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}


}

