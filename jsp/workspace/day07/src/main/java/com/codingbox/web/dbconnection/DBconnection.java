package com.codingbox.web.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection getConnection() {
		Connection conn = null;
		
	
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "jsp";
			String password = "jsp";
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 접속 실패");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 오류");
		}
				
		return conn;
	}
	
	
	
}
