package javabasic.exthread;

public class ExThread2 {
	
	boolean flag;
	
	public static void main(String[] args) {
		
		ExThread2 ex = new ExThread2();
		
		Thread upper = new UpperThread(ex);
		upper.start();
		
		Thread lower = new LowerThread(ex);
		lower.start();
	
		
	} //main

} //class