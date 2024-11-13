package javabasic.project;

import java.util.Scanner;

public class User {
	
	Scanner sc = new Scanner(System.in);
	
	int lottoBuyNum;
	int lottoprice;
	
	public User(Scanner sc, int lottoBuyNum, int lottoprice) {
		super();
		this.sc = sc;
		this.lottoBuyNum = lottoBuyNum;
		this.lottoprice = lottoprice;
	}

	void Price() {
		System.out.println("구매할 로또의 갯수는 몇개입니까?");
		this.lottoBuyNum=sc.nextInt();
		this.lottoprice=this.lottoBuyNum * 1000;
		System.out.println("총 로또의 가격은 " + this.lottoprice + "입니다.");
	}
	
	
	

}
