package javabasic.oop;

public class PrintMain {

	public static void main(String[] args) {
		
		//잉크젯프린터 하나 생성해서 켜고, 프린트하고, 끄기
		
		//인터페이스를 구현한 클래스의 객체를 생성하면 "항상" 인터페이스타입 참조변수를 사용한다.
		//WHY? 프로그램 구현이 유연하고 확장성 있어 진다.
		//InkJetPrinter inkjet = new InkJetPrinter("삼성", "S820", 3000); (X) 클래스타입 참조변수사용한것
		IPrinter inkjet = new InkJetPrinter("삼성", "S820", 3000); //**최상위타입으로 받기
//		inkjet.turnOn(); //메소드 호출
//		inkjet.print();
//		inkjet.turnOff();
		operate(inkjet);

		
		//인터페이스를 구현한 클래스의 객체를 생성하면 "항상" 인터페이스타입 참조변수를 사용한다.
		//레이저프린트 하나 생성해서 켜고, 프린트하고, 끄기
		IPrinter razor = new RazorPrinter("LG", "G820", 2500);
		operate(razor);
		
		//실습
		//배열에서 다형성을 활용
		//잉크젯프린터 500개와 레이저프린터 500개를 갖는 배열을 생성 
		IPrinter[] iprinterArr = new IPrinter[1000]; //잉크젯도 IPrinter, 레이저도 IPrinter라 총 1000개가 들어갈 공간을 생성 
		
		//배열에 잉크젯 프린터 객체 500개, 레이저프린터 객체 500개 저장
		int iprinterArrLeng = iprinterArr.length;//1000
		for (int i =0; i< iprinterArrLeng; i++) {
			if (i%2 ==0){
				iprinterArr[i] = new InkJetPrinter("제조사명 : " + (i+1), "Inkjet : " + (i+1), 1000);
			} else {
				iprinterArr[i] = new RazorPrinter("제조사명 : " + (i+1), "Razor : " + (i+1), 2000);
			}
		}
		
		//배열에 있는 것 모두 꺼내서 출력
		//출력형태 : 잉크젯프린터(제조사명1, Inkjet1, 1000원) <= 이런식으로 1000개
		//			  레이저프린터(제조사명1, Razor1, 2000원)
		
		//80점정도~
		for (int i =0; i<iprinterArrLeng; i++) {
			if (iprinterArr[i] instanceof InkJetPrinter) { //iprinterArr이 InkJetPrinter클래스의 타입인지 확인하는 연산
				System.out.print("잉크젯프린터(");
			} else if (iprinterArr[i] instanceof RazorPrinter){
				System.out.print("레이저프린터(");
			}
			print(iprinterArr[i]);
		}
		//100점
		//toString() 오버라이딩을 이용해보자
		//company, name, price 는 AbstractPrinter가 가지고있다.
		//그러므로 AbstractPrinter에 toString()을 오버라이딩하자
		for (IPrinter iprinter : iprinterArr) { //배열의 향상된 for문
			System.out.println((AbstractPrinter)iprinter); //오버라이딩한 toString()을 가져와야하므로 하위형변환사용
		}
		
	} //main
	
	//상위형변환, 하위형변환 모두 활용, 80점코드에 사용
	static void print(IPrinter iprinter) {
		System.out.print(((AbstractPrinter)iprinter).company); //company는 AbstractPrinter클래스에 선언되었고,
		System.out.print(" ,");                                            //IPrinter는 갖고있지않기때문에 하위형변환이 실행됨
		System.out.print(((AbstractPrinter)iprinter).name);
		System.out.print(" ,");
		System.out.print(((AbstractPrinter)iprinter).price);
		System.out.println(")");	

		}
	
	// IPrinter인터페이스의 역할 : InkJetPrinter, RazorPrinter의 타입을 일원화
	static void operate(IPrinter iprinter) {
		//iprinter가 가지고 있는 참조값에 따라서 각 클래스의 메소드가 호출됨
		iprinter.turnOn();
		iprinter.print();
		iprinter.turnOff();
	}

}//class
