<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" content="text/html" http-equiv="Content-Type">
<title>로그인</title>
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<form action="login_proc.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" allign="center">
						<input type="submit" value="로그인" />
					</td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>