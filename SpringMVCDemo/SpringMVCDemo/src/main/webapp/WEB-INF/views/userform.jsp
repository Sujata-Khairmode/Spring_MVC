<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="submit" method="post">
<label>UserName:</label>
<input type="text" name="uname" value="${user.email }"><br><br>
<label>PassWord</label>
<input type="password" name="pass" vale="${user.password }">
<button type="submit">SUBMIT</button>


</form>
<br><br>

</body>
</html>