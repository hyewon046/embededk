package javabasic.oop;

//역할 : 프린터라면 구현해야하는 공통 기능들에 대한 명세를 작성
public interface IPrinter {
	
	//method prototype = method signature = 메소드 원형
	//중괄호 열면 구현한것이므로 X
	//public abstract 생략해도 됨
	public abstract void turnOn(); 
	public abstract void print(); 
	public abstract void turnOff();
	
	

}
