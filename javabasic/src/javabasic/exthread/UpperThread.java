package javabasic.exthread;

public class UpperThread extends Thread{
	
	private int i =65;
	ExThread2 ex;
	UpperThread(ExThread2 ex) {
		this.ex = ex;
	}
	
	private ExThread2 up;

	@Override
	public void run() {

//		for(int i = 65; i<91; i++) {
//			System.out.println("대문자 : " + (char)i);
			
		while(true) {
			synchronized(ex) {
				if(!ex.flag) System.out.println((char)i++);
					ex.flag = true;
				}
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		
	}//run

}//class
