<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>REGISTER</h1>
<form action="createaccountdata" method="post">
<pre>
Username  <input type="text" name="username"><br>
Password  <input type="password" name="password"><br>
</pre>
<input type="submit" value="Submit">
<input type="reset" value="Clear"><br>
Already have account ?<br>
<a href="login">Login</a>
</form>
</body>
</html>