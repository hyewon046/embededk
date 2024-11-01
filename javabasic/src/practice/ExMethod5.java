package practice;

public class ExMethod5 { //선생님코딩
	
	public static final int SUBJECT_COUNT = 3; //상수로 과목수 고정(추후 평균구할때 쓰려고)

	public static void main(String[] args) {
		 
		//데이터 저장
		String[][] infoArr = {
				{"김군", "90", "70", "60", "0", "0"},
				{"박군", "70", "40", "50", "0", "0"},
				{"최군", "80", "50", "60", "0", "0"}	
		};
		
		calcScore(infoArr);
		printScore(infoArr);
	}//main
	
	//총점 평균 연산
	static void calcScore(String[][] infoArr) {
		for (int i=0; i<infoArr.length; i++) {
			int sum = 0;
			int avg = 0;
			for (int j=1; j<4; j++) {
				sum += Integer.parseInt(infoArr[i][j]);
			}
			 avg = sum / SUBJECT_COUNT;
			infoArr[i][4] = "" + sum;
			infoArr[i][5] = "" + avg;
		}
	}
	//출력
	static void printScore(String[][] infoArr) {
		for (int i=0; i<infoArr.length; i++) {
			for (int j=0; j<infoArr[0].length; j++) {
				System.out.print(infoArr[i][j] + " ");
			}
			System.out.println();
		}		
	}

	
}//class
