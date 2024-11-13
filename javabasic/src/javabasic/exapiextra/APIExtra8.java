package javabasic.exapiextra;

public class APIExtra8 {

	public static void main(String[] args) { //숫자 48~57, 소문자 97~122, 대문자 65~90, 나머지 기호

		String str = Util.input();
		char[] charArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int bigCount = 0;
		int smallCount=0;
		int numCount=0;
		int signCount=0;
		for(char ch : charArr) {
			if((byte)ch >47 &&(byte)ch<58) {
				numCount++;
			}
			else if((byte)ch >64 &&(byte)ch<91) {
				bigCount++;
			}
			else if((byte)ch >96 &&(byte)ch<123) {
				smallCount++;
			}
			else {signCount++;}
			
		}
		System.out.println("대문자는 " + bigCount + "개, 소문자는 " + 
		smallCount + "개, 숫자는 " + numCount + "개, 기호는 : " + signCount + "개");
		

	}

}
