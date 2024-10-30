package javabasic;

import java.util.Scanner;

public class ExConsoleIO1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		
		int firstInt = 0;
		firstInt = sc.nextInt();
		int secondInt = 0;
		secondInt = sc.nextInt();
		int result = firstInt*secondInt;

		
		/*int firstInt = 0;  
		int secondInt = 0;
		
		if (sc.hasNext()) { //hasNext()는 다음에 받을게 있는지 확인하는 과정(생략해도되긴함)
			firstInt = sc.nextInt();
			secondInt = sc.nextInt();
		}*/
		
		
		System.out.println("두수의 곱은 " + result + "입니다." );
		
		sc.close();
		
	}
	
	
	

}
