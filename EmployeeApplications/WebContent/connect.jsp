<%@ page import="java.sql.*" %>
<% 
Connection con;
PreparedStatement ps;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/application";
String username ="root";
String password ="root";
con =DriverManager.getConnection(url, username, password);
%>
