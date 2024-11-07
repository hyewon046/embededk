package javabasic.oop;

public abstract class AbstractPrinter implements IPrinter {
	
	String company;
	String name;
	int price;

	public AbstractPrinter(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
	String sort;

	@Override
	public void turnOn() {
		System.out.println(name + "프린터의 전원을 켜다!");

	}

	@Override
	public abstract void print(); //abstract는 추상클래스이기때문에 프린트불가

	@Override
	public void turnOff() {
		System.out.println(name + "프린터의 전원을 끄다!");
	}
	
	@Override
	public String toString() {
		return sort + "(" + company + ", " + name+ ", " + "price" + ")";
	}

}
