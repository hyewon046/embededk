package javabasic.excollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Fruits2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> fruitname = new HashSet<String>();
		
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
