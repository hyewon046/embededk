package practice;

import java.util.Scanner;

public class ExConditionalStatement2 { //성적범위

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력해주세요 : ");
		int score = sc.nextInt();
		if (score <=60) System.out.println("F");
		else if (score <= 70) System.out.println("D");
		else if (score <= 80) System.out.println("C");
		else if (score <= 90) System.out.println("B");
		else if (score <= 100) System.out.println("A");
		
		sc.close();
	}

}
