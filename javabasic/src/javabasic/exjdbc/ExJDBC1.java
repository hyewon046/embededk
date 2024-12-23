package javabasic.exjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 실습 1 ) 이니셜 계정의 STUDENT 테이블
//           PreparedStatement 사용 CRUD(Insert > Update > Delete > Select 순)
public class ExJDBC1 {

	public static void main(String[] args) {
		
		Connection conn = ConnectionUtil.getConnection();
		
		// insert
//		String insertSQL = " insert into student values(seq_std.nextval, ?, ?, ?) ";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(insertSQL);
//			pstmt.setString(1, "김군");
//			pstmt.setString(2, "kim@gmail.com");
//			pstmt.setString(3, "010-1234-1234");
//			int result = pstmt.executeUpdate();
//			if (result > 0) System.out.println("입력 성공!");
//			
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}

		// update
//		String updateSQL = " update student set student_name = '김민규' where student_id = ? ";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(updateSQL);
//			pstmt.setInt(1, 21);
//			int result = pstmt.executeUpdate();
//			if (result > 0) System.out.println("업뎃 성공!");
//			
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
		
		// delete
//		String deleteSQL = " delete student where student_id = ? ";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
//			pstmt.setInt(1, 21);
//			int result = pstmt.executeUpdate();
//			if (result > 0) System.out.println("삭제 성공!");
//			
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
		
		// select
		String selectSQL = " select * from student ";
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
		pstmt = conn.prepareStatement(selectSQL);
		rs = pstmt.executeQuery();
		
		if (rs != null) {
			while (rs.next()) {
				System.out.println(rs.getInt("student_id") + " " + rs.getString("student_name") + " " + rs.getString("email")
				+ " " + rs.getString("phonenumber"));
			}
		}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
		ConnectionUtil.closeConnection(conn);

	} //main

} //class
