<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	ArrayList<String> arList = new ArrayList<>();
	arList.add("Hello");
	arList.add("JSP");
	arList.add("EL");
	arList.add("JSTL");
	pageContext.setAttribute("list",arList);
%>
<body>
		아이디  : ${id} <br>
		비밀번호 :${pw}<br>
		아이디  : ${param.id} <br>
		비밀번호 :${param.pw}<br>
		${list }
		
		
	</form>
</body>
</html>