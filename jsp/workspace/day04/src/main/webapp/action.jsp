<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String username = request.getParameter("user_name");
	if( username == null ){
		username = "이름이 없습니다.";
	}
	// 앞,뒤 공백 제거
	username = username.trim();
	if( username.equals("") ){
		username = "이름을 입력하세요.";
	}
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=username %>
</body>
</html>










