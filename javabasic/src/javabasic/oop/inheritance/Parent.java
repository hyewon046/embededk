package javabasic.oop.inheritance;

//상속해주는 클래스
//상위 클래스(super) = 부모클래스(parent) = 기본클래스(base)\

//private인 변수나 메서드, 생성자는 상속에서 제외된다

public class Parent { //extends object 생략
	
	private static int psi; //private 상속 불가
	private int pnsi; //private 상속 불가
	
	static int si; //상속 가능
	int nsi; //상속 불가능
	
	public Parent() {	 //생성자 상속불가
	}
	
	private static void psm() { //private 상속 불가
		System.out.println("psm()");
	}
	
	private void pm() { //private 상속 불가
		System.out.println("pm()");
	}
	
	static void sm() { //상속 가능
		System.out.println("sm()");
	}
	
	void m() {//상속 가능
		System.out.println("m()");
	}

}
