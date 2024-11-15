package javabasic.exexception;

public class ExceptionTest1 {
	
	//long[] longArr = new long[1024*1024*1024]; //heap메모리는 대충 2기가인데 이거는 생성하려면 8기가가 필요함
	
	public static void main(String[] args) {
	
		//OutOfMemory Error
		//new ExceptionTest1();
		
		//StackOverflow Error //메소드 순환참조
		a();
		
	}
	
	private static void a() {
		System.out.println("b 호출됨");
		b();
	}
	
	private static void b() {
		System.out.println("a 호출됨");
		a();
		
	}

}
