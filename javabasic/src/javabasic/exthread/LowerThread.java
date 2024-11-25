package javabasic.exthread;

public class LowerThread extends Thread{
	
	int i = 97;
	ExThread2 ex;
	LowerThread(ExThread2 ex) {
		this.ex=ex;
	}
	
	@Override
	public void run() {
		
//		for(int i = 97; i<123 ; i++) {
//			System.out.println("소문자 : " + (char)i);

		while(true) {
			synchronized(ex) {
				if(ex.flag) System.out.println((char)i++);
				ex.flag = false;
				
			}
			
			try {
				if(i==123) this.interrupt();
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.exit(0);
			}
		}

	
	}
	
	

}
