package javabasic.excollection;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Student> studentinfo = new ArrayList<Student>();
		for (int i =0; i<3; i++) {
//			studentinfo.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}

		
		StringTokenizer st = new StringTokenizer(sc.next(), ",");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		for(Student student : studentinfo) {
			System.out.println(student);
		}
		
	sc.close();
	}//main

}//class
