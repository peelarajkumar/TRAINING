<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DOCTOR PROFILE </title>
</head>
<body bgcolor ="wheat">
<center>
<h1>WELCOME TO DOCTOR HOME</h1>
<h2>    Logged in successfull   </h2>
<center>
<a href = "doctor_home.html">HOME</a>  |
<a href = "doctor_profile.jsp">PROFIE</a>   |
<a href = "index.html">LOGOUT</a> 
</center>
</body>
</html> 

<%@ page import="java.sql.*" %>
<<table border="2" align ="center" width="600" height="300">
<tr><td>ID</td><td>NAME</td><td>Email</td><td>Phone</td><td>Specialization></td></tr>
<% 
Connection con;
PreparedStatement ps;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mydata";
String username ="root";
String password ="root";
con =DriverManager.getConnection(url, username, password);
String email =(String)session.getAttribute("semail");
ps=con.prepareStatement("select * from doctor where email=?");
ps.setString(1,email);

ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(7)%></td>

</tr>

	
 <%}
 %>
 </table>