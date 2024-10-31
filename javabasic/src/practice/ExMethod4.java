package practice;

import java.util.Scanner;

public class ExMethod4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		output(i);
		
		sc.close();
	}
	//입력
//	static int star(int a) {
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		return a; //main메소드에 스캐너로 입력받는 부분을 넣어 이 메소드는 필요하지않다고 판단
//	}
	
	//출력
	static void output(int a) {
		//ExMethod4 sstar = new ExMethod4();
		//int k = ExMethod4.star(5); //객체생성해서 메소드호출하려고함
		for (int i=0; i< a ; i++) { 
			for(int j=0; j<=i; j++ ) { 
				System.out.print("*");
			}
			System.out.println(); 
		}
	}
}
