package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIExtra9 {

	public static void main(String[] args) {
		
		char[] chArr = getText().toCharArray();

		int[] countArr = new int[3];

		for (char ch: chArr) {
			String str = String.valueOf(ch);
			if (str.matches("[가-힣]")) {
				countArr[0]++;
			} else if (str.matches("[a-zA-Z]")) {
				countArr[1]++;
			} else if (str.matches("[\\W_]")) {
				countArr[2]++;
			}
		}
		System.out.printf("한글은%d번, 영문은%d번, 기호는%d번", countArr[0],countArr[1],countArr[2]);
	}
	
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

}
