package javabasic.project;

import java.util.Scanner;

public class User {
	
	Scanner sc = new Scanner(System.in);
	
	int lottoBuyNum;
	int lottoprice;
	
	public User(Scanner sc, int lottoBuyNum, int lottoprice) {
		this.sc = sc;
		this.lottoBuyNum = lottoBuyNum;
		this.lottoprice = lottoprice;
	}

	public int Price() {
		this.lottoBuyNum=sc.nextInt();
		this.lottoprice=this.lottoBuyNum * 1000;
		return lottoprice;
	}
	
	
	

}
