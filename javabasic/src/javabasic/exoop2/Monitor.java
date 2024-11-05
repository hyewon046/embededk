package javabasic.exoop2;

public class Monitor {
	
	String company; // 제조회사
	String model; // 모델명
	int inch; // 인치 수
	int price;// 가격
	
	public Monitor(){
	}
	
	public Monitor(String company) {
		this.company=company;
	}
	
	public Monitor(String company, String model) {
		this.company=company;
		this.model=model;
	}
	
	public Monitor(String company, String model, int inch) {
		this.company = company;
		this.model=model;
		this.inch=inch;
	}
	
	public Monitor(String company, String model, int inch, int price) {
		this.company = company;
		this.model=model;
		this.inch=inch;
		this.price=price;
	}
	
	

}
