package javabasic.exoop2;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동", "산적", 20, 170.5f);
		System.out.println(person); //person뒤에 .toString() 생략됨
		


	}

}
