package javabasic.exapiextra;

public class APIExtra5 {

	public static void main(String[] args) {
		
		String[] str = Util.multiinput(2);
		
		int idx = -1;
		int count=0;
		while ((idx=str[0].indexOf(str[1], idx+1)) >= 0) {
			count++;
		} System.out.println("2번째줄은 1번째 줄에" + count +"번 나옵니다");

	}

}
