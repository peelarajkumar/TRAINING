
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Home</title>
</head>
<body bgcolor ="wheat">
<center>
<h1>WELCOME TO MANAGER HOME</h1>
<h2>     </h2>
<center>
<a href = "manager_home.html">HOME</a>  |
<a href = "manager_profile.jsp">PROFIE</a>   |
<a href="view_leaves.jsp">VIEW APPOINTMENTS</a> |
<a href = "index.html">LOGOUT</a> 
</center>
<br>
<%@include file = "connect.jsp" %>
<table border="2" width="600" height ="300" cellpadding="20" align = "center" >
<tr><td>EMPLOYEE NAME</td><td>GENDER</td><td>EMAIL</td><td>DEPARTMENT</td><td>LEAVE TYPE</td><td>START DATE</td><td>END DATE</td><td>TOTAL COUNT</td><td>ACTION</td>
<%
String sql = "select* from leaves";
ps=con.prepareStatement(sql);

ResultSet rs = ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><a href = "accept.jsp?name=<%=rs.getString(1) %>">Accept</a></td>
<% }%>
</table>

</body>
</html>


