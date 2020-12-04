<%@include file = "connect.jsp" %>
<%
String aid = request.getParameter("aid");
int id = Integer.parseInt(aid);
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String age = request.getParameter("age");
int p_age = Integer.parseInt(age);
String email = request.getParameter("email");
String bgroup = request.getParameter("bgroup");
String specialist = request.getParameter("specialist");
String date = request.getParameter("date");
String time = request.getParameter("time");
String sql="insert into appointment values(?,?,?,?,?,?,?,?,?)";

ps=con.prepareStatement(sql);
ps.setInt(1, id);
ps.setString(2, name);
ps.setString(3, gender);
ps.setInt(4, p_age);
ps.setString(5, email);
ps.setString(6, bgroup);
ps.setString(7, specialist);
ps.setString(8, date);
ps.setString(9, time);
int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("appointment.jsp?msg=Appointment applied");
	
}
%>
