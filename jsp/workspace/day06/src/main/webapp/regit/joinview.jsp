<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join view</title>
</head>
<body>
	<h3>회원가입 폼</h3>
	<form action="join" method="post" id="joinForm"> 
		아이디 <input type="text" name="userid" id="userid"><br>
		패스워드 <input type="password" name="userpw" id="userpw"><br>
		이름 <input type="text" name="username" id="username"><br>
		핸트폰번호 <input type="text" name="userphone" id="userphone"><br>
		<br>
		<input type="button" value="회원가입" onclick="sendit()">
	</form> 
</body>
</html>
<!-- js파일 include -->
<!--
src : ../js/common.js
	.. -> 폴더 밖으로 나옴
 -->
<script type="text/javascript" src="../js/common.js"></script>