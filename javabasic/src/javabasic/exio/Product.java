package javabasic.exio;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = 5688631521L;
	
	String name;
	String serialNum;
	int price;
	
	public Product(String name, String serialNum, int price) {
		this.name = name;
		this.serialNum = serialNum;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name+ ", " + serialNum + ", " + price;
	}
	
	
	

}
