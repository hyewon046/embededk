package javabasic.exthread;

public class FiveThread extends Thread{
	private int i=0;
	@Override
	public void run() {
		
		while (true) {
			i+=5;
			System.out.println("5의 배수 : " + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	
	} //run

}//class
