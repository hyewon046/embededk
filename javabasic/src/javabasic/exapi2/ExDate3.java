package javabasic.exapi2;

import java.util.Calendar;
import java.util.Scanner;

public class ExDate3 {

	public static void main(String[] args) {
		
		//연도 4자리 입력받아서 1월부터 12월까지 달력을 출력
		System.out.println("연도를 4자리로 입력해주세요");
		printCalendar(inputYear());

	}//main
	
	private static String inputYear() {
		Scanner sc=new Scanner(System.in);
		String year = sc.nextLine();
		sc.close();
		return year;
	}
	
	private static void printCalendar(String year) { 
		
		Calendar cal = Calendar.getInstance();
		
		for (int a=0; a<12; a++) {
			
			cal.set(Integer.parseInt(year), a, 1);
			
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			System.out.println("["+(a+1)+"월]");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for (int i=1; i<dayOfWeek; i++) System.out.print("\t");
			
			for(int i=1; i<lastDayOfMonth+1;i++) {
				System.out.print(i + "\t");
				if ((dayOfWeek+(i-1))%7==0) System.out.println(); 
			}
			System.out.println("\n\n");
		}
	}

}//class
