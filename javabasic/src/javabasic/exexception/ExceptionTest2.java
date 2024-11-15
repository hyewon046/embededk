package javabasic.exexception;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나눗셈을 할 두 정수를 입력해주세요!");
		
		//실습3번까지 다했으면 extra
		//1. 입력한 것이 숫자인 경우는 정수로 변환하기
		//2. 입력한 것이 숫자이지만 int의 범위를 넘어가면 예외처리 하기
		//3. 입력한 것이 숫자가 아닌 경우에 대해 예외처리하기 ((Double or Float).isNaN()) 숫자가 아니면 true
		
		//내가한거
//		int i = sc.nextInt();
//		int k = sc.nextInt();
//		 
//		try {
//			if (k != 0) System.out.println(i/k);
//			else if (k == 0) throw new ArithmeticException();
//		} catch (ArithmeticException ae) {
//			System.out.println("0으로 나눌 수 없습니다!");
//		}
//		
//		//선생님ver.
//		try {
//			System.out.println(sc.nextInt()/sc.nextInt());
//		} catch (ArithmeticException ae) { //예외가 발생할 경우
//			System.out.println("0으로 나눌 수 없습니다.");
//		} finally {
//			sc.close();
//		}
		
		//extra
		
		//사용자 입력을 double 2개에 저장
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		//int로 변환해서 저장할 변수 2개
		int i1=0;
		int i2=0;
		
		try {
			//숫자면 int로 형변환
			if(!Double.isNaN(d1)) {i1 = (int)d1;}
			if(!Double.isNaN(d2)) {i2 = (int)d2;} //1번조건
			
			//int의 범위를 넘는지 확인
			if (i1>Integer.MAX_VALUE || i1 <Integer.MIN_VALUE ) {
				try {
					//예외를 발생시킴
					throw new Exception() {}; //2번조건 {}는 익명클래스, 없?애도 되긴한듯
				} catch (Exception ex) {
					System.out.println("int의 범위를 넘었습니다.");
				}
			}
			
			System.out.println(i1/i2);
		} catch (NumberFormatException nfe) { //3번조건
			System.out.println("숫자를 입력해주세요!");
		} catch (ArithmeticException ae) { 
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			sc.close();
		}
			


	} //main

} //class
