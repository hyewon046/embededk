package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {

	//2차원 배열, 이름과 휴대폰번호 저장
	static String[][] infoArr = new String[5][4];
	
	public static void main(String[] args) {
		
		System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
	    System.out.println("형식:홍길동 000-0000-0000");
	      
	      inputInfo(); //데이터 저장 함수 호출
	      printInfo(); //데이터 출력 함수 호출
	}
	
	//데이터를 저장할 메소드
	private static void inputInfo() { 
		Scanner sc = new Scanner(System.in);
		
		//행의 수
		int infoArrLeng = infoArr.length; 
		//사용자가 입력한 한 줄의 문자열을 저장할 변수
		String line="";
		
		//행의 수만큼 반복
		for(int i = 0; i<infoArrLeng; i++) {
			//한 줄의 문자열을 저장
			line=sc.nextLine();
			//이름을 각 행의 첫번째 열에 저장
			//홍길동 010-1234-5678 입력 => 홍길동
			infoArr[i][0] = line.substring(0, line.indexOf(' '));//이름, 인덱스0부터 공백있기전까지의 문자열 반환(첫번째 공백이니까 이름만 반환)
			//휴대폰번호를 - 기준으로 자르는 토크나이저 생성
			//010-1245-6789 > 010 1245 6789 로 자름
			StringTokenizer st
			= new StringTokenizer(line.substring(line.indexOf(' ')+1), "-");//이름공백뒤부터 -전까지 반환
			//열 인덱스
			int j = 1;
			//토큰이 있는동안 반복
			while (st.hasMoreTokens()) { //뒤에 더 오는 토큰이 있다면 반복
				//국번, 앞자리번호, 뒷자리번호 배열에 저장
				infoArr[i][j] = st.nextToken();
				j++;
			}
		}
		sc.close();
	} //inputInfo
	
	//데이터 출력 메소드
	private static void printInfo() {
		  //행의 수
	      int infoArrLeng = infoArr.length;
	      //열의 수
	      int infoArr0Leng = infoArr[0].length;
	      //열의 수만큼 반복
	      for (int i=0; i<infoArr0Leng; i++) {
	    	  //행의 수만큼 반복
	         for (int j=0; j<infoArrLeng; j++) {
	        	 //출력
	            System.out.print(infoArr[j][i] + " "); //원래 가로인데 세로를 덩어리로 묶어서 출력해야되서 j와 i의 순서를 바꿈
	         }
	         System.out.println();
	     }
	 } //printInfo

	
//	public static void input(String str) {
//		Scanner sc = new Scanner(System.in);
//			String stu = sc.next();
//	}
//	
//	public static void print(String str) {
//		StringTokenizer st = new StringTokenizer(str, " ");
//		while (st.hasMoreElements()) {
//			System.out.println(st.nextToken());
//		}
//	}

} 
//"[가-힣]{3}\s\\d{3}-\\d{4}-\\d{4}";
