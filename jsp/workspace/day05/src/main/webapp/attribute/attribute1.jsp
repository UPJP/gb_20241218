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
		String userid = "admin";
		String userpw = "admin1234";
		String username = "김사과";
		
		request.setAttribute("userid", userid);
		request.setAttribute("userpw", userpw);
		request.setAttribute("username", username);
// 		pageContext.forward("attribute2.jsp");
		response.sendRedirect("attribute2.jsp");

// 		session.setAttribute("userid", userid);
// 		session.setAttribute("userpw", userpw);
// 		session.setAttribute("username", username);
		//pageContext.forward("attribute2.jsp");
// 		response.sendRedirect("attribute2.jsp");
	%>
</body>
</html>












