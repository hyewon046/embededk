package javabasic.oop;

public class IAnimalMain {

	public static void main(String[] args) {
		
		// 멍멍 짖는 강아지
		IAnimal meongDog = new Dog2();
		meongDog.sound();
		
		//왈왈 짖는 강아지
		IAnimal warlDog = new AnimalAdapter() { //한마리만 만들기 
			public void sound() {
				System.out.println("왈왈");
			};
		};
		warlDog.sound();
		
		

	}

}
