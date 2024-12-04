package projectteam1;

public class Timer extends Thread{
// 로딩바, 시간타이머  
	
	@Override
		public void run() {
		
			try {
				for (int i = 90; i >=0; i--) {
					if (i>=1)
					System.out.println(i);
					else System.out.println("시간종료!");
				}
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}

		
		}//run

}//class
