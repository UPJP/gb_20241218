<%@page import="java.sql.ResultSet"%>
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
	Class.forName(driver);
	conn = DriverManager.getConnection(url, user, pass);

	String sql = "SELECT * FROM car";
	// dbeaver 에서의 쿼리문 날리는 명령어
	PreparedStatement pstm = conn.prepareStatement(sql);

	// 쿼리를 실행하고 결과를 ResultSet에 저장
	ResultSet rs = pstm.executeQuery();

	while (rs.next()) { // while문으로 반복 ResultSet에 다음 행이 있으면
		// 차번호를 가져오는 명령어
		// 2가지 방법이 있음
		// 인덱스 번호로 가져오기
		out.print("차번호: " + rs.getString(1) + "<br>");
		// 컬럼명으로 가져오기
		out.print("차종류: " + rs.getString("BRAND") + "<br>");
		out.print("차색상: " + rs.getString(3) + "<br>");
		out.print("차종류: " + rs.getString("PRICE") + "원<br>");
	}
	out.print("<br><hr><br>");
	String carnum = "3";
	// 너무 복잡함
	// sql = "SELECT  * FROM car WHERE CARNUM = '"+carnum+"'";
	// 다음으로 쉬움
	sql = "SELECT  * FROM car WHERE CARNUM = ?";
	pstm = conn.prepareStatement(sql);
	// 첫 '?'에 carnum이라는 파라미터를 넣기
	pstm.setString(1, carnum);
	rs = pstm.executeQuery();
	if(rs.next()) {
		out.print("차번호: " + rs.getString(1) + "<br>");
		out.print("차종류: " + rs.getString("BRAND") + "<br>");
		out.print("차색상: " + rs.getString(3) + "<br>");
		out.print("차종류: " + rs.getString("PRICE") + "원<br>");
	}
	// 객체 반납 re, pstm, conn을 닫아줘야함 객체 생성 순서의 역방향으로 닫아줘야함
	rs.close();
	pstm.close();
	conn.close();
	%>
</body>
</html>