package projectteam1;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 게임 GUI
public class MouseRoadGUI extends JFrame{

	// 프레임만들기

	// x누르면 닫히기

	// 큰 패널 만들기

	// 랭킹보드
	// 종료버튼 클릭시 랭킹보드 랭킹갱신
	
	// 시간보드

	// 로고보드

	// 맵보드

	// 팝업창

	// 맵보드의 블럭들 만들기

	// 맵보드의 시작, 종료 버튼
	// 버튼 클릭시 이벤트 발생

	// 검은 화면 - black 클래스
	// 시작버튼 클릭시 사라지고, 종료버튼 클릭시 다시 발생

	
	// 검은블럭에 마우스가 닿으면 gameover 되는 이벤트 발생 만들기
	
	
	// 검은 화면이 맵을 가린동안 마우스 에리어 이벤트 발생시키지 않도록하기
	
	//타이머 로딩바 실행
	public MouseRoadGUI() {
		int second = 90;
		JPanel jpanel = new JPanel();
		jpanel.setLayout(null);
		
		TimeBar timebar = new TimeBar(second);
		Thread threadbar = new Thread(timebar);

		jpanel.add(timebar);
		
		add(jpanel);
		setTitle("로딩바");
		setSize(800, 1200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		threadbar.start();
		setVisible(true);
		
	}//constructor
	
	public static void main(String[] args) {
		new MouseRoadGUI();
	}
	
}//class
