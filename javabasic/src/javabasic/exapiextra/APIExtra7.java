package javabasic.exapiextra;

public class APIExtra7 {

	public static void main(String[] args) { //아스키코드 수 차이를 이용하기
		
		//
		String str = Util.input();
		char[] charArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch : charArr) {
			if((byte)ch<91) {
				sb.append((char)(ch+32));}
			else {
					sb.append((char)(ch-32));
			}
			
		}
		System.out.println(sb);
	}

}
