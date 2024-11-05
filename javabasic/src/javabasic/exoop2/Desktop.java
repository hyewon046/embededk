package javabasic.exoop2;

public class Desktop {
	
	String cpu;
	String memory;
	int price;
	
	public Desktop() {
	}
	
	public Desktop(String cpu) {
		this.cpu = cpu;
	}
	
	public Desktop(String cpu, String memory) {
		this.cpu = cpu;
		this.memory = memory;
	}
	
	public Desktop(String cpu, String memory, int price) {
		this.cpu = cpu;
		this.memory = memory;
		this.price = price;
	}

}
