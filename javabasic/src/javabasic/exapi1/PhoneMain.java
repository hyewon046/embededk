package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {

	static String[][] infoArr = new String[5][4]; //2차원 배열
	
	public static void main(String[] args) {
		
		System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
	    System.out.println("형식:홍길동 000-0000-0000");
	      
	      inputInfo();
	      
	      printInfo();
	}
	
	private static void inputInfo() { //입력받기
		Scanner sc = new Scanner(System.in);
		
		int infoArrLeng = infoArr.length; 
		String line="";
		
		for(int i = 0; i<infoArrLeng; i++) {
			line=sc.nextLine();
			infoArr[i][0] = line.substring(0, line.indexOf(' ')); //이름, 인덱스0부터 공백있기전까지의 문자열 반환(첫번째 공백이니까 이름만 반환)
			StringTokenizer st
			= new StringTokenizer(line.substring(line.indexOf(' ')+1), "-");//이름공백뒤부터 -전까지 반환
			int j = 1;
			while (st.hasMoreTokens()) { //뒤에 더 오는 토큰이 있다면 반복
				infoArr[i][j] = st.nextToken();
				j++;
			}
		}
		sc.close();
	} //inputInfo
	
	private static void printInfo() {
	      int infoArrLeng = infoArr.length;
	      int infoArr0Leng = infoArr[0].length;
	      for (int i=0; i<infoArr0Leng; i++) {
	         for (int j=0; j<infoArrLeng; j++) {
	            System.out.print(infoArr[j][i] + " ");
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
