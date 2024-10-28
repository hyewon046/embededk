import java.util.Scanner;

public class Test6 { //switch 문으로 달별 계절표현하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력해주세요 : ");
		String str = sc.next();
		switch (str) {
		case "1": 
			System.out.println("겨울");
			break;
		case "2": 
			System.out.println("겨울");
			break;
		case "3": 
			System.out.println("봄");
			break;
		case "4": 
			System.out.println("봄");
			break;
		case "5": 
			System.out.println("봄");
			break;
		case "6": 
			System.out.println("여름");
			break;
		case "7": 
			System.out.println("여름");
			break;
		case "8": 
			System.out.println("여름");
			break;
		case "9": 
			System.out.println("가을");
			break;
		case "10": 
			System.out.println("가을");
			break;
		case "11": 
			System.out.println("가을");
			break;
		case "12": 
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	
}
	}
