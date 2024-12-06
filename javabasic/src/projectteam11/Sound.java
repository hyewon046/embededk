package projectteam11;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Sound implements Runnable{
	@Override
	public void run() {
			String filePath = "D:\\embededk\\files\\bgm.mp3"; // 재생할 MP3 파일 경로

	        try {
	           FileInputStream fis = new FileInputStream(filePath);
	           
	            // JLayer Player 객체 생성
	            Player mp3Player = new Player(fis);

	            System.out.println("노래 재생 중...");
	            mp3Player.play(); // MP3 파일 재생

	        } catch (Exception e) {
	        	Thread.interrupted();
	            System.err.println("노래 정지");
	        } 
		
	}
    
}
