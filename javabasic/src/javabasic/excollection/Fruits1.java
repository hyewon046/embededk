package javabasic.excollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fruits1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> fruitname = new ArrayList<String>();
		
		for(int i=0; i < 5; i++) {
			fruitname.add(sc.next());
		}
			
		Iterator<String> it = fruitname.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		sc.close();
	}//main

}//class
