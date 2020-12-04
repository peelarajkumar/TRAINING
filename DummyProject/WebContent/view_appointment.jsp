
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Home</title>
</head>
<body bgcolor ="wheat">
<center>
<h1>WELCOME TO DOCTOR HOME</h1>
<h2>     </h2>
<center>
<a href = "doctor_home.html">HOME</a>  |
<a href = "doctor_profile.jsp">PROFIE</a>   |
<a href="view_appointment.jsp">VIEW APPOINTMENTS</a> |
<a href = "index.html">LOGOUT</a> 
</center>
<%@include file = "connect.jsp" %>
<table border="2" width="600" height ="300" cellpadding="20" align = "center" >
<tr><td>Patient Name</td><td>Age</td><td>Gender</td><td>bgroup</td><td>specialist</td><td>Date</td><td>Time</td>
<%
String specialist = (String)session.getAttribute("specialization");
String sql = "select* from appointment where specialist=?";
ps=con.prepareStatement(sql);
ps.setString(1, specialist);
ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
	
<% }%>
</table>

</body>
</html>


