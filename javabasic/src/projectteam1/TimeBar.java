package projectteam1;

import java.awt.Color;

import javax.swing.JLabel;

public class TimeBar extends JLabel implements Runnable {
	
	int width = 800, height = 25;
	Color color = Color.RED;

	private int startTime;
	
	public TimeBar(int startTime) {
		this.startTime =startTime;
		setOpaque(true); //불투명도 (true를 선택하면 배경이 보이게함)
		setBackground(color);
		setSize(width,height); //위치, 크기 조정
	}

	@Override
	public void run() {
			int decrease = (startTime*1000)/width; //초당 몇번의 작업을 해야하는지 밀리초로 변환
			while (width >0) {
				try {
					Thread.sleep(decrease-1); 
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
					width -= 1;
					setSize(width, height);	
//					revalidate(); //동적 변화를 시켰을때 계속 갱신하여 재생성할 수 있게 만드는 메소드
				    repaint(); //컴포넌트를 다시 그리도록 하는 메소드
			}
		
		
		
	}//run
	
}//class