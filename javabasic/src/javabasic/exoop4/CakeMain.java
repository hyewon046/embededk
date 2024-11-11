package javabasic.exoop4;

public class CakeMain {

	public static void main(String[] args) { 
		
//		Cake moca = new Cake("모카") { //이름을 생성자에 세팅할 수 있나를 보기위해
//			@Override
//			String getName() {
//				return super.getName(); //name은 프라이빗이라 못가져옴
//			}
//		};
//		System.out.println(moca.getName());
		
		printCake("모카");
		printCake("초콜릿");
		printCake("바나나");

	}//main
	
	public static void printCake(String name) { //위 코드 반복 방지를 위해 기능을 넣은 메서드로 만들었음
		Cake cake = new Cake(name) { 
			@Override
			String getName() {
				return name; 
			}
		};
		System.out.println(cake.getName() + "케이크가 만들어 졌습니다!");
	}

}//class
