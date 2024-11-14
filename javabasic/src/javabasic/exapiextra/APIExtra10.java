package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;

public class APIExtra10 {

	public static void main(String[] args) {
		//영단어 나누기 (영어가 아닌건 없애버리기, 공백제외)
		//공백 기준으로 자르기
		//단어 길이 순서대로 정렬하기?
		//맨앞과 맨뒤 반환하기?
		//개수구하기
		
		char[] chrArr = getText().toCharArray();
		int[] countArr = new int[2];

		for (char ch : chrArr) {
			String str = String.valueOf(ch);
//			if (str.contains("[가-힣] || [\\w_]") {
//					//삭제한다
//			} Array.sort(str);
		}
		System.out.println("가장 긴 단어는" + chrArr[chrArr.length-1] +"이고, 가장 짧은 단어는 " + chrArr[0] + "이다.");
		
		
		

	}//main
	
	private static String getText() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File("C:\\Users\\Administrator\\git\\embededk\\javabasic\\src\\javabasic\\exapiextra\\americadoi.txt")));
			String line = "";
			String americadoiTxt = "";
			while ((line=br.readLine())!=null) {
				americadoiTxt += line;
			}
			br.close();
			return americadoiTxt;
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return null;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

}//class
