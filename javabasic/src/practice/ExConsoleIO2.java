package javabasic;

import java.util.Scanner;

public class ExConsoleIO2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("문자열 3개를 입력해주세요");
		boolean str1 = true||false;
		boolean str2 = true||false;
		boolean str3 = true||false;
		
		str1 = sc.hasNextBoolean();*/
		
		System.out.println("3개의 문자열을 입력해주세요");
		//불리언인 것의 개수를 저장할 변수
		int booleanCount = 0;
		
		if(sc.hasNextBoolean()) {
			booleanCount++; //booleanCount = booleanCount +1;	
		}
		sc.next();
		if(sc.hasNextBoolean()) {
			booleanCount++; //booleanCount = booleanCount +1;	
		}
		sc.next();
		if(sc.hasNextBoolean()) {
			booleanCount++; //booleanCount = booleanCount +1;	
		}
		System.out.println("총" + booleanCount +"개의 boolean이 있습니다.");
		sc.close();
	}

}

