package javabasic;

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
			for (int j=1; j<6-i; j++) { 
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
		
		//5
		for (int i=0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j%4 == 0 || i%4 == 0 )
					System.out.print("*");
				else System.out.print("o");
			} System.out.println();
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
		System.out.println();
		
		//6
		for (int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				if (i==j) System.out.print("*");
				else System.out.print("o");
			}
			System.out.println();
					}
		
		
	}
}
