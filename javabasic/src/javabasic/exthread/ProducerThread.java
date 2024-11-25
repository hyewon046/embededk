package javabasic.exthread;

public class ProducerThread extends Thread{
	
	@Override
	public void run() {
		
		
		while (true) {
			int tvNum = 0;
				tvNum = (int)(Math.random()*10)+1;
		}
	} //run

}
