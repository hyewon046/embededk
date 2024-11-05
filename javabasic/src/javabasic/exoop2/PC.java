package javabasic.exoop2;

// PC객체를 생성하려면 Monitor, Desktop, Keyboard가 있어야 함
// ***has a 관계 (위임관계, delegation)
// 상속받지 않아도 가지고 있으므로 사용할 수 있는 관계 
// PC has a Monitor
// PC has a Desktop
// PC has a Keyboard
public class PC {
	
	String company; // 제조회사
	int price; //가격
	
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;
	
	public PC() { //기본생성자
	}

	public PC(String company,Monitor monitor, Desktop desktop, Keyboard keyboard) {
		this.company = company;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	}
	//파라미터가 있는 생성자를 만들면 기본 생성자를 안만들어줘서 필요하면 코딩 해줘야함
	
	public int getPrice() {
		return this.price; //pc의 price
	}
	
	// PC의 가격은 모니터 가격 + 데스크탑 가격 + 키보드 가격
	public void setPrice() {
		this.price = monitor.price +desktop.price + keyboard.price;
	}

} // class
