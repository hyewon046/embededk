package javabasic.exapiextra;

public class APIExtra4 {

	public static void main(String[] args) {
		
		String[] str = Util.multiinput(2);		

		System.out.println(str[0].contains(str[1]) ? "포함한다." : "포함안한다."); //삼항연산자 사용하면 좋음
		
		
	}

}
