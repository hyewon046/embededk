package projectteam11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javabasic.exgui.ExMemopad1;

// 게임 GUI
public class MouseRoadGUI extends JFrame{
	
	 private static final int CENTER = 0;

	public static void main(String[] args) {

	      // 프레임만들기
	      JFrame frame = new JFrame("Mouse Road");

	      // X버튼 누르면 닫히도록 설정
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      // 프레임 크기 설정
	      // JFrame 사이즈
	      frame.setSize(800, 1000);

	      // 큰 패널 만들기
	      JPanel basicPanel = new JPanel();
	      // 상단 고정 패널 (랭킹, 타이머, 로고 틀)
	      JPanel topPanel = new JPanel(new BorderLayout());
	      topPanel.setPreferredSize(new Dimension(800, 150)); // 크기 설정

	      // [Ranking] 왼쪽 패널
	      JPanel leftPanel = new JPanel();
	      leftPanel.setPreferredSize(new Dimension(300, 150));
	      leftPanel.setBackground(new Color(200, 200, 255));
	      leftPanel.add(new JLabel("Ranking"));
	      //leftPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5)); // 테두리
	      topPanel.add(leftPanel, BorderLayout.WEST);

	      // [Logo] 오른쪽 패널
	      JPanel rightPanel = new JPanel();
	      rightPanel.setPreferredSize(new Dimension(300, 150));
	      rightPanel.setBackground(new Color(200, 255, 200));
	      rightPanel.add(new JLabel("Logo"));
	      topPanel.add(rightPanel, BorderLayout.EAST);
	      
	      // [Timer] 가운데 패널
	      JPanel centerPanel = new JPanel();
	      centerPanel.setPreferredSize(new Dimension(400, 125));
	      
	      TimeNum timerNum = new TimeNum(40); // 40초
	      timerNum.setBounds(250, 50, 100, 50); // 위치와 크기 설정
	      timerNum.setHorizontalAlignment(CENTER); // 텍스트 중앙 정렬
	      timerNum.setFont(new Font("맑은 고딕",Font.BOLD, 60)); 
	      
	      centerPanel.add(timerNum);

	      topPanel.add(centerPanel, BorderLayout.CENTER);

	      // [Timer Bar] 가운데 패널 아래 직사각 패널
	      JPanel bottomPanel = new JPanel();
	      bottomPanel.setPreferredSize(new Dimension(800, 30)); 
	      bottomPanel.setLayout(null);

	      int second = 40;
	      TimeBar timebar = new TimeBar(second);
	      
	      bottomPanel.add(timebar);

	      Thread barThread = new Thread(timebar);
	      Thread numThread = new Thread(timerNum);
	     
	      barThread.start();
	      numThread.start();
	      
	      topPanel.add(bottomPanel, BorderLayout.SOUTH);

	      basicPanel.add(topPanel, BorderLayout.NORTH);
	      
	      
	      frame.add(basicPanel); // 상단 패널
	      frame.setVisible(true);

	      // 맵보드
//	      JPanel boardPanel = new JPanel(new GridLayout(SIZE, SIZE));
//	      boardPanel.setPreferredSize(new Dimension(640, 640));
	      // MouseListener
	      // 미로 패널
	      // 미로 패널 생성 (16x16 그리드)
	      
	      // 맵로더에서 인덱스 0번의 맵을 호출
//	      MapLoader ml = new MapLoader();
//	      mapData
//	      
//	      JPanel mazepanel = new JPanel(); // 16x16 그리드
//
//	      // 이너클래스 JComponent
//	      JComponent jcomponent = new JComponent() {
//	         @Override
//	         protected void printComponent(Graphics g) {
//	            super.printComponent(g);
//	            int blocksize = 3;
//	            
//	            for (int i = 0; i < ml ; i++) {
//	               for (int j = 0; j < colSize; j++) {
//	                  gameMap[i][j] = new Block(i, j, Color.BLACK, true);
//	               }
//	            }
	            
	            
	         }
//	      };

	      // 각 셀에 버튼 추가 (이후 기능 추가 가능)
	         
	      

	      // 마우스 리스너 패널
//	      JPanel mouseListenerPanel = new JPanel();
//	      JLabel mouseLabel = new JLabel("마우스 상태: 대기 중");
//	      mouseListenerPanel.addMouseListener(new MouseAdapter() {
//	         @Override
//	         public void mouseEntered(MouseEvent e) {
//	            mouseLabel.setText("마우스 상태: 영역 안");
//	         }
//	         
//	         @Override
//	         public void mouseExited(MouseEvent e) {
//	            mouseLabel.setText("마우스 상태: 영역 밖");
//	         }
//	      });
//	      mouseListenerPanel.add(mouseLabel); // 마우스 리스너
	      // 팝업창

	      // 맵보드의 블럭들 만들기

	      // 맵보드의 시작, 종료 버튼
	      // 버튼 클릭시 이벤트 발생

	      // 검은 화면 - black 클래스
	      // 시작버튼 클릭시 사라지고, 종료버튼 클릭시 다시 발생

	      // 검은블럭에 마우스가 닿으면 gameover 되는 이벤트 발생 만들기

	      // 검은 화면이 맵을 가린동안 마우스 에리어 이벤트 발생시키지 않도록하기

	      // 종료버튼 클릭시 랭킹보드 랭킹갱신
	      // 메인 프레임 설정
	      // frame.setLayout(new BorderLayout());
//	      frame.add(basicPanel); // 상단 패널
//	      frame.setVisible(true); // 프레임 보이기

	   
}

	
	//타이머 로딩바 실행
//	public MouseRoadGUI() {
//		int second = 90;
//		JPanel jpanel = new JPanel();
//		jpanel.setLayout(null);
//		
//		TimeBar timebar = new TimeBar(second);
//		Thread threadbar = new Thread(timebar);
//
//		jpanel.add(timebar);
//		
//		add(jpanel);
//		setTitle("로딩바");
//		setSize(800, 1200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		threadbar.start();
//		setVisible(true);
//		
//	}//constructor
	
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(MouseRoadGUI::new);
//	}
	
//class
