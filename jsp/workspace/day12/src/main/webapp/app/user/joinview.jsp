<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/userJoin.us">
		<p>
			아이디<input type="text" name="userid">
		</p>
		<p>
			비밀번호<input type="password" name="userpw">
		</p>
		<p>
			이름<input type="text" name="username">
		</p>
		<p>
			핸드폰<input type="text" name="userphone">
		</p>
		<p>
			주소<input type="text" name="useraddr">
		</p>
		<p>
			<input type="submit" value="회원가입">
		</p>
	</form>
</body>
</html>