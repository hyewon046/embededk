import java.util.Scanner;  //10.29 실습 4 미리해보기

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력해주세요 : ");
		int score = sc.nextInt();
		/*switch (score) {
		case 1 : score=100;
			System.out.println("A");
			스위치문으로 할수있을거같은데 어케하는지 모루겠엉
				

			
		}*/
		if (score <=60) {
			System.out.println("F");
		}
		else if (score <=70) {
			System.out.println("D");
		}
		else if (score <=80) {
			System.out.println("C");
		}
		else if (score <=90) {
			System.out.println("B");
		}
		else if (score <= 100) {
			System.out.println("A");
		}
		else {System.out.println("잘못된 점수입니다.");}
		

	}
} 
