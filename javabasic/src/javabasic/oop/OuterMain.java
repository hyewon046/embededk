package javabasic.oop;

public class OuterMain {
	
	public static void main(String[] args) {
		
		//Outer 클래스 객체 생성
		Outer outerObject  = new Outer();
		outerObject.print();
		
		//static inner class 객체 생성 (Outer.SIClass이 타입)
		//Outer 클래스를 통해서 static inner 클래스의 객체를 생성할 수 있음
		Outer.SIClass outerSIClassObject = new Outer.SIClass();
		outerSIClassObject.print();
		
		//non-static inner class 객체 생성
		//Outer 클래스의 객체를 생성한 후에 non-static inner 클래스의 객체가 생성될 수 있음
		Outer.NSIClass outerNSIClassObject= new Outer().new NSIClass();
		outerNSIClassObject.print();
		
		Outer.NSIClass outerNSIClassObject2= outerObject.new NSIClass();
		outerNSIClassObject.print();

		
	}//main

}//class
