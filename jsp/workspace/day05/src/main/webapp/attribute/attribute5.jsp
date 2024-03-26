<%@page import="com.codingbox.web.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	User[] arUser = {
		new User("admin","김자바",10),
		new User("hong","홍길동", 100),
		new User("lee","이순신",250)
	};
	request.setAttribute("users", arUser);
	pageContext.forward("attribute6.jsp");
%>
</body>
</html>











