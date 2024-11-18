package javabasic.excollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonInfo { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> personinfomap = new HashMap<String, String>();
		
		for(int i=0; i < 3; i++) {
			String input = sc.nextLine();
			String name = input.substring(0, input.indexOf(',')); //문자열관련 쓰는거 중요
			String age = input.substring(input.indexOf(',')+1);
			personinfomap.put(name, age);
			
		}
			
		Set<Map.Entry<String, String>> entrySet = personinfomap.entrySet();
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
	
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
//			System.out.println(entry.getKey() + "은 " + entry.getValue() + "살");
			System.out.printf("%s은 %s살\n", entry.getKey(), entry.getValue()); //s는 문자열 d는 숫자 %.(자릿수)f는 실수(소수점)
		}
		
		//keySet()사용
//		Set<String> keySet = personinfomap.keySet();
//		Iterator<String> it2 = keySet.iterator();
//		while(it2.hasNext()) {
//			String key = it2.next();
//			System.out.printf("%s은 %s살\n", key, personinfomap.get(key));
//		}
		
		sc.close();
	}//main

}//class
