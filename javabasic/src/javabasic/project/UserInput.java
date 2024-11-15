package javabasic.project;

import java.util.Scanner;

public class UserInput {
	
	private int[] inputNum = new int[6];


	 public int[] getInputNumbers() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("로또 번호를 6개 입력하세요 :");

	        int count = 0;
	        while (count < 6) {
	            int number = sc.nextInt();
	            if (number >= 1 && number <= 45 && !Duplicate(inputNum, number)) {
	                inputNum[count] = number;
	                count++;
	            } else {
	                System.out.println("다시입력해주세요! : ");
	            }
	        }
	        return inputNum;
	    }

	 
	    public static boolean Duplicate(int[] array, int number) {
	        for (int n : array) {
	            if (n == number) {
	                return true;
	            }
	        }
	        return false;
	    }


}
