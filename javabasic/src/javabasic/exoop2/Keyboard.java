package javabasic.exoop2;

public class Keyboard {
	
	int KeyCount; // 키 개수
	boolean wireless; // 유무선 여부
	int price; // 가격
	
	public Keyboard() {
	}
	
	public Keyboard(int KeyCount) {
		this.KeyCount = KeyCount;
	}
	
	public Keyboard(int KeyCount, boolean wireless) {
		this.KeyCount = KeyCount;
		this.wireless = wireless;
	}
	
	public Keyboard(int KeyCount, boolean wireless, int price) {
		this.KeyCount = KeyCount;
		this.wireless = wireless;
		this.price = price;
	}
	

}
