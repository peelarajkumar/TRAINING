<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment page</title>
</head>
<body bgcolor ="wheat">
<center>
<h1>WELCOME TO APPOINTMENT PAGE</h1>
<h2>    </h2>
<a href = "patient_home.html">HOME</a>  |
<a href = "patient_profile.jsp">PROFIE</a>   |
<a href = "index.html">LOGOUT</a> 
<br><br><br>
</center>
</body>
<form action="./apply_appointment.jsp" align="center">
<input type="number" name="aid" placeholder="Enter appointment Id">
<input type="text" name="name" placeholder="Enter Patient name">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="FeMale">Female
<input type="number" name="age" placeholder="Enter Patient age">
<input type="email" name="email" placeholder="Enter Email">
<select name="bgroup" >
<option value="A+ve">A+ve</option>
<option value="B+ve">B+ve</option>
<option value="O+ve">O+ve</option>
<option value="AB+ve">AB+ve</option>
<option value="O-ve">O-ve</option>
<option value="B-ve">B-ve</option>
</select>
<select name="specialist" >
<option value = "Dental">Dental</option>
<option value = "Gynacol">Gynacol</option>
<option value = "Nuero">Nuero</option>
<option value = "Skin">Skin</option>
</select>
<input type="date" name="date" placeholder="Select the date">
<input type="text" name ="time" placeholder="Enter the time">
<input type="submit" value="Book now">


</form>
</html>