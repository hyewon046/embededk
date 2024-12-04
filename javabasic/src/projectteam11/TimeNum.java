package projectteam11;

import javax.swing.JLabel;
import java.awt.*;

public class TimeNum extends JLabel implements Runnable {
	private int startTime;

		    // 생성자
		  public TimeNum(int startTime) {
		        this.startTime = startTime; // 시작 시간 설정
		    }

		    @Override
		    public void run() {
		    	setText(String.valueOf(startTime)); // 초기 숫자 설정
		        while (startTime > 0) {
		            try {
		                Thread.sleep(1000); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            startTime--; // 1초 감소
		            setText(String.valueOf(startTime)); 
		            repaint();
		        }
		        setText("시간종료!"); 
		    }
		}


