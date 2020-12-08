<%@include file = "connect.jsp" %>
<%
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String email = request.getParameter("email");
String department = request.getParameter("department");
String leavetype = request.getParameter("leavetype");
String startdate = request.getParameter("startdate");
String enddate = request.getParameter("enddate");
String count  = request.getParameter("totaldays");



String sql="insert into leaves values(?,?,?,?,?,?,?,?)";

ps=con.prepareStatement(sql);

ps.setString(1, name);
ps.setString(2, gender);
ps.setString(3, email);
ps.setString(4, department);
ps.setString(5, leavetype);
ps.setString(6, startdate);
ps.setString(7, enddate);
ps.setString(8, count);


int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("leaves.jsp?msg=Leaves applied");
	
}
%>
