package javabasic.project;

import java.util.Scanner;
import java.util.StringTokenizer;

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
		
		System.out.println("로또번호 6개를 입력해주세요!");
		input();
		
		// 랜덤정수 추출
		// Math.random() : 0.0<=n<1.0 범위의 실수를 반환
		//int randomNumber = (int)(Math.random()*45)+1; //1~45
			
		// 스캐너 생성
		//Scanner sc = new Scanner(System.in);
		
		// 한 라인의 문자열 입력
		//String line= sc.nextLine();

		// 문자열을 공백문자 기준으로 토크나이징(토큰으로 분리)
		//StringTokenizer st = new StringTokenizer(line);
		
		// 토큰이 있는 동안 반복
//		while(st.hasMoreTokens()) {
//			// 토큰 하나씩 가져와서 출력
//			String token = st.nextToken();
//			System.out.println(token);
//		}
//		sc.close();
		

	}//main
	//번호 입력
	static void input() {
		Scanner sc = new Scanner(System.in);
		int[] inputNum = {0,0,0,0,0,0};
		int inputNumLength = inputNum.length;
		for (int i=0; i<inputNumLength; i++) {
			inputNum[i] = sc.nextInt(); //중복없이 입력되었는지 확인필요
			System.out.println(inputNum[i]);
		}
	}

}//class
//내가 정한 순서
//1. 정수입력받기(중복없게 조건걸기)
//2. 정수 랜덤뽑기(중복없게 조건걸어서)
//(3. 중복없는지 체크)
//4. 번호에 따른 등수 정하기
//5. 출력하기
