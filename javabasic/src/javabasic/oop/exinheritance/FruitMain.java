package javabasic.oop.exinheritance; 

public class FruitMain {

	public static void main(String[] args) {
		
		Fruit f1 = new Fruit();
		System.out.println(f1.getCountry());
		
		Fruit f2 = new Mango();
		System.out.println(f2.getCountry());
		
		Fruit f3 = new Strawberry();
		System.out.println(f3.getCountry());
		
		Fruit f4 = new Watermelon();
		System.out.println(f4.getCountry());

	}

}
