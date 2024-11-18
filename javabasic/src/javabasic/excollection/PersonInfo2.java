package javabasic.excollection;

import java.util.ArrayList;
import java.util.List;

public class PersonInfo2 {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>(); //element에 person을 넣을 수 있음
		
		personList.add(new Person("홍길동", "20"));
		personList.add(new Person("이순신", "30"));
		personList.add(new Person("강감찬", "40"));
		
		for(Person person : personList) { //list에서 향상된 for문 사용 가능
			System.out.println(person);
		}
	
	}//main
	
}//class
