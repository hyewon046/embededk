package practice;

import java.util.Scanner;

public class ExMethod3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

	}// main
	//입력
	static void input (int a, int b, String str) {
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b= sc.nextInt();
		 str=sc.next();
	}
	
	//연산
	static void operator (int a, int b, String str) {
		if (str.equals("+")) {
			System.out.println(a+b);
		} else if (str.equals("-")) {
			System.out.println(a-b);
		} else if (str.equals("*")) {
			System.out.println(a*b);
		} else if (str.equals("/")) {
			System.out.println(a/b);
		}
	}
	//출력
	static void print() {
		
		
		
	
	}
	

}//class
