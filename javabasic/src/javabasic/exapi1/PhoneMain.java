package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {

	public static void main(String[] args) {
		String stu1="";
		input();
		print(stu1);

	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<6; i++) {
			String str1 = sc.next(); 
		}
	}
	
	public static void print(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.nextToken());
	}
	
//	"[가-힣]{3}\s\\d{3}-\\d{4}-\\d{4}";

}
