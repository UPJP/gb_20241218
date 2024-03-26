<%@page import="com.codingbox.web.dao.UserDAO"%>
<%@page import="com.codingbox.web.dto.UserDTO"%>
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
// joinview에서 넘어온 값을 받아옴
String userid = request.getParameter("userid");
String userpw = request.getParameter("userpw");
String username = request.getParameter("username");
String userphone = request.getParameter("userphone"); 
// dto 객체 생성
UserDTO udto = new UserDTO();
// 객체에 각각 저장
udto.setUserid(userid);
udto.setUsername(username);
udto.setUserphone(userphone);
udto.setUserpw(userpw);
// dao 객체 생성 dao에서 DB 커넥션에대헤 정의되어 있음
UserDAO udao = new UserDAO();
// 불리언 타입으로 udao.join()이 실행이 됬는지 안됬는지 확인
boolean check = udao.join(udto);
if (check) {//회원가입
	
} else { //가입실패
	
}
udao.join(udto);
%>
</body>
</html>