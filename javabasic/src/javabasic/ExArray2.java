package javabasic;

public class ExArray2 {

	public static void main(String[] args) {
		/*String[][] strArr = {
				{"김군", "박양", "이군"},
				{"A", "B", "C"}
		};
		for (String[] sArr : strArr) {
			for (String j : sArr) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*String[] name = {"김양", "박군", "이군"};
		char[] score = {'A', 'C', 'B'};
		
		for(String sArr : name) {
			for(char j : score ) {
				System.out.println(sArr + " : " + j);
			}
		}*/
		String[][] strArr = {
				{"김군", "박양", "이군"},
				{"A", "B", "C"}
		};
		System.out.println(strArr[0][0] + " : " + strArr[1][0] +"\n" 
		+ strArr[0][1] + " : " + strArr[1][1] +"\n" 
		+ strArr[0][2] + " : " + strArr[1][2] );
		
	}
}
