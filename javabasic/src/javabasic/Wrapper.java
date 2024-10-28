package javabasic;

public class Wrapper {
public static void main(String[] args) {
		
		byte b = 1; 
		short s = 2; 
		int i = 4; 
		long l = 8; 
		float f = 3.14f;                
		double d = 4.6; 
		char c = 'M'; 
		boolean bool = true;
		
		// Wrapper class
		// Wrapping : 기본타입의 값을 갖는 참조타입을 생성하는 것 = Boxing
		// 기본타입마다 해당하는 래퍼클래스를 제공함
		Byte wb = new Byte(b);
		Short ws = new Short(s);
		Integer wi = new Integer(i);
		Long wl = new Long(l);
		Float wf = new Float(f);
		Double wd = new Double(d);
		Character wc = new Character(c);
		Boolean wbool = new Boolean(bool);
		
		// Unwrapping : 참조타입이 가지고 있는  기본타입의 값을 꺼내는 것= Unboxing
		System.out.println(wb.byteValue());
		System.out.println(ws.shortValue());
		System.out.println(wi.intValue());
		System.out.println(wl.longValue());
		System.out.println(wf.floatValue());
		System.out.println(wd.doubleValue());
		System.out.println(wc.charValue());
		System.out.println(wbool.booleanValue());
		
		// auto wrapping, auto unwrapping
		// auto wrapping : wrapping이 자동으로 일어남
		// 3은 int타입이라 Integer타입에 할당해야함
		// 자동으로 3이 new Integer(3)이 된다 => auto wrapping
		Integer i2 = 3;
		/*int i1=3; 
		Integer i2 = new Integer(i1);*/ //확실치않음
		
		
		// auto unwrapping : unwrapping이 자동으로 일어남
		// i2는 Integer타입이므로 +연산을 위해서 i2가 가진 3을 자동으로 꺼냄
		// i2.intValue(3) 연산이 자동으로 수행됨 => auto unwrapping
		//int result = i2.intValue() + 5;
		int result = i2 + 5;
		System.out.println(result);
		
	}

}
