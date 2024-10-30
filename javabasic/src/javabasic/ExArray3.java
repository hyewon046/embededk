package javabasic;

public class ExArray3 {

	public static void main(String[] args) {

		String[][] scoreArr = {
				{"홍길동", "90", "80", "70"},
				{"강감찬", "80", "70", "60"},
				{"이순신", "60", "50", "40"},	
		};
		
		int[] totalArr = {0, 0, 0}; //총점저장용
		
		int scoreArrLength = scoreArr.length;
		int scoreArr0Length = scoreArr[0].length;
		int totalArrLength = totalArr.length;
		//총점구하기
		for (int i=0; i<scoreArrLength; i++) {
			for (int j = 0; j<scoreArr0Length; j++) {
				if ( j > 0 ) {
					totalArr[i] += Integer.parseInt(scoreArr[i][j]);
				}
			}
		}
		//출력하기
		for (int i=0; i<totalArrLength; i++) {
			if (totalArr[i] >=200) {
				System.out.println(scoreArr[i][0] + ", 총점 : " + totalArr[i]);
			}
		}
		
		
//		for (int i=0; i<scoreArrLength; i++) {
//			for (int j = 0; j<scoreArr0Length; j++) {
//				if ( j > 0 ) {
//					int h = Integer.parseInt(scoreArr[i][j]);
//					totalArr[0] += h;
//				}
//				System.out.println(totalArr[0]);
//				
//			}
//		} //내가 해본거,,,
	}//main
}//class
