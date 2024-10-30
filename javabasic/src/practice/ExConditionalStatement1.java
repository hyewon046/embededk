package javabasic;

import java.util.Scanner;

public class ExConditionalStatement1 { //두수의합

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int sum = i + j;
		if (sum > 10) System.out.println("10보다 크다");
		else if (sum <= 10) System.out.println("10보다 크지않다.");
		
		sc.close();

	}

}
