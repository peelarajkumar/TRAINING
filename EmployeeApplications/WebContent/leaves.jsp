<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave page</title>
</head>
<body bgcolor ="wheat">
<center>
<h1>WELCOME TO LEAVES PAGE</h1>
<h2>    </h2>
<a href = "_home.html">HOME</a>  |
<a href = "employee_profile.jsp">PROFIE</a>   |
<a href = "index.html">LOGOUT</a> 
<br><br><br>
</center>
</body>
<form action="./apply_leave.jsp" align="center">
<input type="text" name="name" placeholder="Enter Employee name">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="FeMale">Female

<input type="email" name="email" placeholder="Enter Email">
<select name="department" >
<option value = "Travel">Travel</option>
<option value = "Production">Production</option>
<option value = "Safety">Safety</option>
<option value = "R and D">R and D</option>
</select>
<select name="leavetype" >
<option value = "Sick">Sick</option>
<option value = "Casual">Casual</option>
<option value = "Long service">Long service</option>
<option value = "Priviliged">Priviliged</option>
</select>
<input type="date" name="startdate" placeholder="Select the  start date">
<input type="date" name ="enddate" placeholder="Enter the End date">
<input type="text" name ="totaldays" placeholder="Enter the days count">

<input type="submit" value="apply now">


</form>
</html>