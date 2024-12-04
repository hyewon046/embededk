package projectteam1;

import java.awt.Color;

import javax.swing.JLabel;

public class TimeBar extends JLabel implements Runnable {
	
	int width = 700, height = 25;
//	int x = 20, y=130;
	Color color = Color.RED;
	
	int second;
	
	public TimeBar(int second) {
		setOpaque(true); //불투명도 (true를 선택하면 배경이 보이게함)
		setBackground(color);
		setSize(width,height); //위치, 크기 조정
		this.second = second;
	}

	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep((int)(1000 /(double) (width / second))); //초당 몇번의 작업을 해야하는지 밀리초로 변환
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			if (getWidth() > 0) {
				width -= 1;
				setSize(width, height);	
			} else System.out.println("시간 종료!"); 

		}
		
		
	}//run
	
}//class
