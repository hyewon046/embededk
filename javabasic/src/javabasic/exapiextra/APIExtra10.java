package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIExtra10 {

	public static void main(String[] args) {
		//영단어 나누기 (공백, 기호기준?)
		//단어 길이 순서대로 정렬하기?
		//맨앞과 맨뒤 반환하기?
		//개수구하기
		
		
		
		

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
