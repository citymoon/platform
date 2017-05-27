<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>
	<form action="loginto" method="POST">
		<p>
			用户名： <input name="userId" type="text">
		</p>
		<p>
			密&nbsp;&nbsp;码： <input name="password" type="password">
		</p>
		<p>
			<input type="submit">
		</p>
	</form>

	<font color="red">${error }</font>
</body>
</html>