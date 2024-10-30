package javabasic;

public class ExOpereator1 {

	public static void main(String[] args) {
		//부호연산자
		int i = 3;
		int j = -2;
		
		//비트연산자
		byte b1 = 5;
		byte b2 = ~5; //00000101 > 11111010
		System.out.println(b2);
		
		byte b3 = 4;
		byte b4 = 5|4; // or
		byte b5 = 5 & 4; // and
		byte b6 = 5 ^ 4; //xor
		
		//쉬프트
		i = 4;
		int k = 5>>2; // 00000101 -> 00000001 //1
		int b = 6>>>4; //00000110 -> 00000000 //0
		
		//나머지
		int u = i%3; //1
		
		//관계
		System.out.println(i == b1);
		System.out.println(i != b1);
		System.out.println(i > b1);
		System.out.println(i >= b1);
		System.out.println(i < b1);
		System.out.println(i <= b1);
		
		//대입
		i = b1;
		i += b1;  // i = i + b1
		i -= b1; // i = i - b1
		i *= b1; // i = i*b1
		i /= b1; // i = i/b1
		i %= b1; // i = i%b1
		
		//논리 ! & | && || 
		
		
		

	}

}
