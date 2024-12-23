package javabasic.exjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

//실습 2. 이니셜 계정의 STUDENT 테이블
//1) 한 행의 데이터를 입력하는 프로시져 PROC_INSERT_STUDENT 생성
//2) STNO를 입력하면 이름을 반환하는 함수 FUNC_GET_STNAME 생성
//3) 프로시져와 함수 호출하여 결과 출력
public class ExJDBC2 {

	public static void main(String[] args) {
		
		Connection conn = ConnectionUtil.getConnection();
		
		// 프로시져 호출
		try {
			CallableStatement cstmt = conn.prepareCall( "{call PROC_INSERT_STUDENT(?, ?, ?)}" );
			cstmt.setString(1, "전군");
			cstmt.setString(2, "jeon@gmail.com");
			cstmt.setString(3, "010-1234-1235");
			cstmt.execute();
			System.out.println("성공!");
			
			// 함수 호출
			cstmt = conn.prepareCall( "{? = call FUNC_GET_STNAME(?)}" );
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.setInt(2, 22);
			cstmt.execute();
			System.out.println("함수의 리턴값 : " + cstmt.getString(1));
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
				
				
		
			
	} //main

} //class
