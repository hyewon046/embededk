package practice;

public class ExLoopStatement2 { //별찍기

	public static void main(String[] args) {
		//1
		// i : 0, j : 0
		// i : 1, j : 0 1
		// i : 2, j : 0 1 2
		// i : 3, j : 0 1 2 3 
		// i : 4, j : 0 1 2 3 4
		for (int i=0; i<5; i++) { //줄의 수 i
			for(int j=0; j<i+1; j++) { //별의 수 j
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		//2
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3
		// i : 0, j : 0, k : 0 1 2 3 4
		// i : 1, j : 0 1, k : 0 1 2 3
		// i : 2, j : 0 1 2, k: 0 1 2
		//---
		for (int i=0; i<5; i++) { //줄의 수
			for (int j=0; j<i; j++) { //공백의 수
				System.out.print("  ");
			}
			for (int k=0; k<5-i; k++) { //별의 수
				System.out.print("*");
			}
			System.out.println();
		}
		
		//4
		for (int i=1; i<6; i++) {
			for (int j=1; j<6-i; j++) { //
				System.out.print("  ");
			}
			for (int j=1; j<i*2; j++) {
				System.out.print("*");
			}
			for (int j=1; j<6-i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
		//4선생님
//		for (int i=0; i<5; i++) { // 줄의 수
//			for (int j=4-i; j>0; j--) { // 공백의 수
//				System.out.print("o");
//			}			
//			for (int j=0; j<=2*i; j++) { // 별의 수
//				System.out.print("*");
//			}
//			System.out.println(); // 줄바꿈
//		}
		
		//5
		for (int i=0; i<5; i++) { //줄의 수
			for (int j = 0; j < 5; j++) { //별의 수
				if (j%4 == 0 || i%4 == 0 )
					System.out.print("*");
				else System.out.print("o");
			} System.out.println(); //줄바꿈
		}

			
	
		/*System.out.println();
		for (int i =0; i<3; i++) {
			if(i<3) System.out.println("*     *");
		}*/ //1번
		/*System.out.println();
		for (int i = 0; i<5; i++) {
			if (i == 0 || i == 4) System.out.print("*");
			else System.out.print("o");
		} System.out.println();*/ //2번

		
		//6
//		for (int i=0; i<5; i++) {
//			for(int j=0; j<i+1; j++) {
//				if (i==j) System.out.print("*");
//				else System.out.print("o");
//			}
//			System.out.println();
//					}
		for (int i=0; i<5; i++) { // 선생님, 인덱스 체크하면서 풀기 (0,0) (1,1) etc..
			for (int j=0; j<5; j++) { 
				if (i==j || 4-i==j) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println(); 
		}
		
		//7 선생님
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<5; j++) { // 별의 수
				if (i==j || 4-i==j || i%4==0 ||  j%4==0) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println(); // 줄바꿈
		}System.out.println();
		
		
		// Extra 실습
		// 별찍기
		//1) 배열 미사용 버전
		//2) 배열 사용 버전
		//3) 3이상의 홀수를 입력하면 최대 별의 개수가 
		//    입력한 별의 개수가 되는 다이아몬드 별찍기
		//     *
		//   ***
		// *****
		//   ***
		//     *
		// i(줄)   : 0 1 2 3 4
		// j(별)   : 1 3 5 3 1
		// k(공백): 2 1 0 1 2
		// k = (5-j)/2 //5는 줄의 수, 2는 i의 중간값
		// 절댓값 : Math.abs(2-i)
		// j = -2*(Math.abs(2-i))+5
		
		
		//1)
		
		 for (int i=0; i<5; i++) { //줄의 개수
			 for(int j=0;j<-2*(Math.abs(2-i))+5; j++) {
				 
			 }
		}
				 System.out.println();//줄바꿈
			 
		//2) //배열값이 0이면 공백, 1이면 *을 찍어라로 명령하면됨
		
		int[][] starArr = {
				{0,0,1,0,0},
				{0,1,1,1,0},
				{1,1,1,1,1},
				{0,1,1,1,0},
				{0,0,1,0,0}
		};
		
		int starArrLength = starArr.length;
		int starArr0Length = starArr[0].length;
		for (int i=0; i<starArrLength;i++) {
			for (int j=0; j<starArr0Length;j++) {
				if (starArr[i][j]==0) {
					System.out.println("o");
				} else System.out.println("*");
			}System.out.println();
				
		}
	}
}
