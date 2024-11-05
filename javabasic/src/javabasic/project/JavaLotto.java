package javabasic.project;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.StringTokenizer;

// Java Lotto : 개인 JAVA 프로젝트
//[ Lotto 프로그램 구현 ]
// 1. 기능
// 1) 사용자에게 1~45 중 중복되지 않은 6개의 정수를 입력받는다.
// 2) 중복되지 않은 7개의 정수를 랜덤하게 뽑아낸다. (앞의 6개는 로또번호, 7번째는 보너스번호)
// 3) 로또 당첨규칙에 따라서 사용자의 당첨등수를 출력한다.
// 2. 규칙
// 1) 사용자가 입력한 6개의 로또번호화 프로그램이 랜덤하게 뽑은 앞 6개 번호가 모두 일치하면 1등
// 2) 사용자가 입력한 6개의 로또번호화 프로그램이 랜덤하게 뽑은 앞 6개 번호 중 5개가 일치하고
//     보너스번호가 일치하면 2등
// 3) 사용자가 입력한 6개의 로또번호화 프로그램이 랜덤하게 뽑은 앞 6개 번호 중 5개가 일치하면 3등
// 4) 사용자가 입력한 6개의 로또번호화 프로그램이 랜덤하게 뽑은 앞 6개 번호 중 4개가 일치하면 4등
// 5) 사용자가 입력한 6개의 로또번호화 프로그램이 랜덤하게 뽑은 앞 6개 번호 중 3개가 일치하면 5등
// 6) 나머지는 꽝!

// 3. 출력 예시
// 로또번호 6개를 입력해주세요!
// (6개정수)
// 추첨번호는 (6개정수) (보너스번호1개)
// n등입니다!

public class JavaLotto {

	public static void main(String[] args) {
		int[] inputNum = {0,0,0,0,0,0};
		int[] randomNum = {0,0,0,0,0,0,0};
//		int bonusNum = 0;
		print(inputNum, randomNum);
	
	}//main
	
	//번호 입력받기
	static void input(int[] inputNum) {
		Scanner sc = new Scanner(System.in);
		int inputNumLength = inputNum.length;
		for (int i=0; i<inputNumLength; i++) {
			inputNum[i] = sc.nextInt();
			System.out.println(inputNum[i]);
			for(int j=0; j<i; j++) {
				if(inputNum[i]==inputNum[j]) {
					System.out.println("중복되는 숫자는 불가합니다.");} 
			}
		} 
	}
	
	
	//랜덤뽑기
	static void choice(int[] randomNum) {
		for(int i=0; i<7; i++) {	
			randomNum[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(randomNum[i] == randomNum[j]) {
					i--;
				}
			}
		} System.out.println(Arrays.toString(randomNum));
	}
	
	//등수 정하기
	static void result(int[] inputNum, int[] randomNum) {
		int count = 0; //일치하는 갯수
//		for (int i=0; i<7; i++) {
//			for (int j=0; j<i; j++) {
//				if(randomNum[i]==inputNum[j]) {
//					count++;
//				}
//			}
//		}
//		switch(count) {
//		case 6: System.out.println("1등!");
//		case 5: System.out.println("2등!");
//		case 4: System.out.println("4등!");
//		case 3: System.out.println("5등!");
//		case 2: System.out.println("꽝! 다음기회에");
//		case 1: System.out.println("꽝! 다음기회에");
//		case 0: System.out.println("꽝! 다음기회에");
//		}
	} 
	
	//출력하기
	static void print(int[] inputNum, int[] randomNum) {
		System.out.println("로또번호 6개를 입력해주세요!");
		input(inputNum);
		System.out.println("\n"+"이번 추첨번호는");
		choice(randomNum);
		System.out.println("\n"+"축하합니다!");
		result(inputNum, randomNum);
	}
}//class