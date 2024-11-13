package javabasic.exapiextra;

import java.util.Scanner;

public class Util {
	public static String input() { //문자열 한줄받는 것
		Scanner sc = new Scanner(System.in);
		String lineText= sc.nextLine();
		sc.close();
		return lineText;
	}
	
	public static String[] multiinput(int lineCount) { //문자열 여러줄받는 것
		Scanner sc = new Scanner(System.in);
		String[] lineTextArr = new String[lineCount];
		for (int i=0; i<lineCount; i++) {
			lineTextArr[i] = sc.nextLine();
		}
		sc.close();
		return lineTextArr;
	}

}
