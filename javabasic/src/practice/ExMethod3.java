package practice;

import java.util.Scanner;

public class ExMethod3 {

	public static void main(String[] args) {
		input();

	}// main
	//입력
	static void input () { //연산자는 한글자라 char 쓰는게 더 나음
		Scanner sc = new Scanner(System.in);
		 print(operator(sc.nextInt(), sc.nextInt(), sc.next()));
	}
	
	//연산
	static int operator (int a, int b, String str) {
		if (str.equals("+")) {
			System.out.println(a+b); //switch문을 써서 case "+": return a+b; 로 써도됨
		} else if (str.equals("-")) {
			System.out.println(a-b);
		} else if (str.equals("*")) {
			System.out.println(a*b);
		} else if (str.equals("/")) {
			System.out.println(a/b);
		}  return 0;
	}
	//출력
	static void print(int result) {
		System.out.println(result);
	}
	

}//class
