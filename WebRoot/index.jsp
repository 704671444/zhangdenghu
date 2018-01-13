<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
</head>
<body>
<form action="registUser" method="post">
	账号:<input type="text" name="userName"/><br>
	密码:<input type="password" name="pwd"/><br>
	邮箱:<input type="text" name="email"/><br>
	省份:<input type="text" name="address.privince"/><br>
	市:<input type="text" name="address.city"/><br>
	县:<input type="text" name="address.steet"/><br>
	<input type="submit" value="提交"/>
</form>
</body>
</html>