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
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month+1, 1);
		
			int firstday=(Calendar.DAY_OF_WEEK);
			int lastday=cal.getActualMaximum(Calendar.DATE);

	
	}

}
