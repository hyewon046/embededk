package javabasic.exapiextra;

public class APIExtra2 {

	public static void main(String[] args) {
		String str = "Hello Java";
	
		int sum=0;
		char[] charArr = str.toCharArray();
		for (char ch : charArr) {
			sum += (int)ch;
		}
		System.out.println(sum);

	}

}
