package com.codingbox.web.dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.codingbox.web.dbconnection.DBconnection;
import com.codingbox.web.dto.MemberDTO;

public class MemberDAO {
   Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
   
   // age찾기
   public int getAge(String name) {
      int age = 0;
      System.out.println("name : " + name);
      
      // db처리
      try {
         conn = DBconnection.getConnection();
         String sql = "SELECT * FROM MEMBER WHERE name=?";
         pstm = conn.prepareStatement(sql);
         pstm.setString(1, name);
         rs = pstm.executeQuery();
         
         if(rs.next()) {
            age = rs.getInt("AGE");
         }
         
      }catch (SQLException e) {
         e.printStackTrace();
         System.out.println("SQL 예외 발생");
      }catch (Exception e) {
         e.printStackTrace();
         System.out.println("SQL 예외 발생");
      }
      
      return age;
   }
   
   // 전체 검색
   public ArrayList<MemberDTO> selectALL(){
      String sql = "SELECT * FROM MEMBER";
      ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
      
      try {
         conn = DBconnection.getConnection();
         pstm = conn.prepareStatement(sql);
         rs = pstm.executeQuery();
         
         while(rs.next()) {
            MemberDTO m = new MemberDTO();
            m.setName( rs.getString(1) );
            m.setAge( rs.getInt(2) );
            result.add(m);
            
         }
         
      }catch (SQLException e) {
         e.printStackTrace();
         System.out.println("SQL 예외 발생");
      }catch (Exception e) {
         e.printStackTrace();
         System.out.println("SQL 예외 발생");
      }
      
      
      return result;
   }
   
   
   
   
   
   
}