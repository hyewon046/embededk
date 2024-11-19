package javabasic.excollection;

public class Card {
	
	private Integer num; //숫자 (A~10, J, Q, K)
	String shape; //모양들 하트 다이아몬드 클로버 스페이드
	
	public Integer getNumber() {
		return num;
	}

	public void setNumber(Integer number) {
		this.num = number;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Card(Integer number, String shape) {
		super();
		this.num = number;
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		return shape+num;
	}
	
	
	
}
