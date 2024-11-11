package javabasic.oop;

public class Dog2 extends AnimalAdapter{ //인터페이스 IAnimal을 상속받았으면 무조건 오버라이딩해야함
															 //Adapter에 기본구현을 해놓았기때문에 오버라이딩 해도되고 안해도됨

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
