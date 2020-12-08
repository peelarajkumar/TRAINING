<%@include file = "connect.jsp" %>
<%

String name = (String)session.getAttribute("name");
String sql = "update leaves set status=?";
ps=con.prepareStatement(sql);
ps.setString(1, "Accepted");


int y=ps.executeUpdate();
if(y!=0)
   response.sendRedirect("view_leaves.jsp?msg=accepted");

%>