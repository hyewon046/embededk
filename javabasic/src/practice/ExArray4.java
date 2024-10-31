package practice;

import java.util.Scanner;

public class ExArray4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//데이터를 저장할 배열
		String[][] inputArr = new String[3][4];
		int inputArrLength = inputArr.length; //3
		int inputArr0Length = inputArr[0].length; //4
		
		
		//스캐너를 통해 데이터를 배열에 저장
		for (int i=0; i<inputArrLength; i++) {
			for (int j=0; j<inputArr0Length; j++) {
				inputArr[i][j] = sc.next();
			}
		}
		
		int[] totalArr = {0, 0, 0};
		int[] avgArr = {0, 0, 0};
		int num = inputArr0Length -1; // 과목의수
		
		int avgArrLength = avgArr.length; //3
		//총점과 평균 산출
		for (int i=0; i<inputArrLength; i++) {
			for (int j=0; j<inputArr0Length; j ++) {
				if (j > 0) {
					totalArr[i] += Integer.parseInt(inputArr[i][j]);
					avgArr[i] = totalArr[i]/num;
				}
			}
		}
		//출력하기
		for (int i=0; i< avgArrLength; i++) {
			System.out.println("학생명 : " + inputArr[i][0] );
			System.out.println("국어 : " + inputArr[i][1] );
			System.out.println("영어 : " + inputArr[i][2] );
			System.out.println("수학 : " + inputArr[i][3] );
			System.out.println("총점 : " + totalArr[i] + "\n" + "평균 : " + avgArr[i] );
			System.out.println();
			
		}
		
		sc.close();

		}		
	}
