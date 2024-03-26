<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="age_db.jsp">
		<label> 이름
			<input type="text" name="name">
		</label><br>
			<input type="submit" >
	</form>
	<input type="button" value="전채확인하기" onclick="selectALL();">
	
	<script>
	function selectALL() {
		location.href = "age_all.jsp"
	}
</script>
</body>

</html>