package javabasic.project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaLotto2 { //선생님 ver. , 코드가 돌아가진 않음, 어떻게할지 길 알려주는것
	
	int[] userNums = new int[6];
	int[] comNums = new int[7];
	
	void inputUserNums() { //숫자입력받기
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		int i=0;
		while(st.hasMoreTokens()) {
			userNums[i] = Integer.parseInt(st.nextToken());
			i++;
		}
	}
	
	void getComNums() { //컴퓨터숫자뽑기
		int comNumsLeng = comNums.length;
		for (int i = 0; i<comNumsLeng; i++) {
			int randomNum = (int)(Math.random()*45)+1;
			if (!checkDup(randomNum)) {
				comNums[i] = randomNum;
			} else {
				i--;
			}
		}
	}
	
	boolean checkDup(int num) { //중복체크로직
		int comNumsLeng = comNums.length;
		for (int i = 0; i<comNumsLeng; i++) {
			if (comNums[i] == num) return true;
		}
		return false;
	}
	
	int getCorrectNums() { 
		//두 배열을 교차해서 맞은 숫자의 수를 리턴하는 코드
		return 4; //4는 걍 빨간줄 없애려고 아무숫자 넣은거임
	}
	
	

}//class
