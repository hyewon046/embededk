import java.util.Scanner; //10.29수업 개인실습3 미리해보기

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두수를 입력하세요 : ");
 
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		
		if (i1+i2 >10 ) {
			System.out.println("10보다 크다.");
		}
		else if (i1+i2 <=10) {
			System.out.println("10보다 크지않다.");
		}

	}


}
