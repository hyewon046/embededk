package javabasic.exapi1;

public class Person {
	
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) { 
			return this.name.equals(((Person)obj).name) 
					&& this.age == ((Person)obj).age; //this 생략해도됨, 중요중요
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n" + "나이 : " + age;
	}

}
