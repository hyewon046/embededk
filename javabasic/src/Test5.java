import java.util.Scanner;

public class Test5 { //10.29 실습5 해보기(구구단)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int m = sc.nextInt();
		int g=1;
		for (m=1; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);
		}
		for (m=2; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);

		}
		for (m=3; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);

		}
		for (m=4; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);

		}
		for (m=5; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);
	
		}
		for (m=6; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);
		
		}
		for (m=7; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);
	
		}
		for (m=8; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);
	
		}
		for (m=9; g<10; g++) {
			System.out.println(m+"x"+g+"="+m*g);
		
		}

}
}//형식은 잘나오는데 입력했을때 원하는 단이 안나옴 계속 1단만 나옴, 해결필요
