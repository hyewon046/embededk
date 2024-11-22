package javabasic.exio;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 459082925662L;
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
