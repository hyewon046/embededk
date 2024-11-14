package javabasic.exapi2;

import java.util.Calendar;
import java.util.Scanner;

public class ExDate2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도와 월을 입력해주세요");
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("연도 : " + year + ", 월 :"+  month);
		
//		String yearMonth = inputYearMonth(); //입력받은 문자열 저장
		
		Calendar cal = Calendar.getInstance();
		
//		cal.set(year, month-1, 1); //month는 내가 입력한 값-> 내가 11월이라고입력하면 10으로 인식되야함
		
		//날짜설정
//		cal.set( //입력을 yearMonth라는 이름으로 6자리 한번에 받을경우 
//				Integer.parseInt(yearMonth.substring(0,4)), //년도 문자열 4개를 정수로
//				Integer.parseInt(yearMonth.substring(4))-1, //년도 문자열 2개를 정수로
//				1 //1일
//				);
		
		printCalendar(
				cal.get(Calendar.DAY_OF_WEEK), //1일의 요일 숫자값(1일 2일 ...)
				cal.getActualMaximum(Calendar.DATE) //월의 마지막날
				);
	}//main
	
	//한줄입력받아서 리턴하는 메소드
	private static String inputYearMonth() {
		Scanner sc=new Scanner(System.in);
		String yearMonth = sc.nextLine();
		sc.close();
		return yearMonth;
	}
	
	//달력 출력 메소드
	private static void printCalendar(int dayOfWeek, int lastDayOfMonth) { 
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//요일값 -1만큼 탭 만들기
		for (int i=1; i<dayOfWeek; i++) System.out.print("\t");

		for(int i=1; i<lastDayOfMonth+1;i++) {
			System.out.print(i + "\t"); //날짜 표시(1일부터 말일까지)
			if ((dayOfWeek+(i-1))%7==0) System.out.println(); //7개마다 줄바꿈
		}
		
	}

}//class
