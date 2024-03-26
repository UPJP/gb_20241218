<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "jsp";
	String pass = "jsp";
	int check = 0;
	
	Class.forName(driver);
	System.out.println("jdbc Driver 로딩 성공");
	
	conn = DriverManager.getConnection(url, user, pass);
	System.out.println("오라클 연결 성공");
	// db 에서 insert 문을 복사 해올 때 ';' 복사 X
	String sql = "INSERT INTO car VALUES('4','honda', 'Blue',70000000)";
	// sql 문 실행
	PreparedStatement pstm = conn.prepareStatement(sql);
	check = pstm.executeUpdate();
	System.out.println("check : " + check);
	if(check != 0) {
		System.out.println("데이터 삽입 성공");
	} else {
		System.out.println("데이터 삽입 실패");
	}
	/* 
	insert, update, delete
		-> pstm.executeUpdate() use
		-> insert, update, delete가 적용된 건수 return
	select
		-> select 된 결과 값을 리턴
	drop, create
		-> 성공 시 0이라는 값을 return
	
	*/
	
%>
</body>
</html>