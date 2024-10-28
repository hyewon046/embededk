import java.util.Scanner; // 점수를 3번 입력받아 60점이 넘는 횟수 구하기

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score1= sc.nextInt();
		int score2= sc.nextInt();
		int score3 = sc.nextInt();
		int scorecount = 0;
		
		if (score1>= 60) {
			scorecount ++;	
		}
		if (score2>= 60) {
			scorecount ++;	
		}
		if (score3>= 60) {
			scorecount ++;
		}
		System.out.println("총" + scorecount + "번 입니다.");
		sc.close();

	}

}
