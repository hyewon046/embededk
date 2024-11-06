package javabasic.project;

import java.util.Arrays;
import java.util.Scanner;

public class JavaLotto {

	public static void main(String[] args) {
		int[] inputNum = new int[6];
		int[] randomNum = new int[7];
		printResult(inputNum, randomNum);
	
	}//main
	
	//번호 입력받기
	static void input(int[] inputNum) {
		Scanner sc = new Scanner(System.in);
		int inputNumLength = inputNum.length;
		for (int i=0; i<inputNumLength; i++) {
			inputNum[i] = sc.nextInt();
			System.out.println(inputNum[i]);
			for(int j=0; j<i; j++) {
				if(inputNum[i] == inputNum[j] || inputNum[i] > 45) {
					i=-1; System.out.println("다시 입력해주세요!");}
			}
		}
	}
	
	
	//랜덤뽑기
	static void getNum(int[] randomNum) {
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
	static void getscore(int[] inputNum, int[] randomNum) {
		int count =0; 
		int bonus = 0;
		int inputNumLength=inputNum.length;
		for (int i=0; i<inputNumLength; i++) {
			if (inputNum[i] == randomNum[6]) bonus++;
			for (int j=0; j<inputNumLength; j++) {
				if(inputNum[i] == randomNum[j]) {
					count++;
				}
			}
		}

		switch(count) {
		case 6: System.out.println("1등!"); break;
		case 5: 	if (bonus == 1) System.out.println("2등!"); 
					else if (bonus ==0) System.out.println("3등!"); break;	
		case 4: System.out.println("4등!"); break;
		case 3: System.out.println("5등!"); break;
		case 2: System.out.println("꽝! 다음기회에"); break;
		case 1: System.out.println("꽝! 다음기회에"); break;
		case 0: System.out.println("꽝! 다음기회에"); 
		}
	} 
	
	//출력하기
	static void printResult(int[] inputNum, int[] randomNum) {
		System.out.println("로또번호 6개를 입력해주세요!");
		input(inputNum);
		System.out.println("\n"+"이번 추첨번호는");
		getNum(randomNum);
		System.out.println("보너스번호는 " + randomNum[6]);
		System.out.println("\n"+"축하합니다!");
		getscore(inputNum, randomNum);
	}
}//class