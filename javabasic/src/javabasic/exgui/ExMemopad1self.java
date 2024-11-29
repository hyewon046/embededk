package javabasic.exgui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class ExMemopad1self extends JFrame{
	
	private final DefaultListModel<String> memoListModel;
    private final JList<String> memoList;
    private final JTextArea memoTextArea;
	
	public ExMemopad1self() {
		
		JFrame frame = new JFrame("메모장 프로그램"	);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400); 
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel border = new JPanel(new BorderLayout());
		
		//왼쪽 메모 리스트
		memoListModel = new DefaultListModel<String> ();
		memoList = new JList<String>(memoListModel);
		memoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollpane = new JScrollPane(memoList);
		
		
		//오른쪽 메모 리스트
		
		
		
		this.memoTextArea = new JTextArea();
		
		//하단 버튼 추가
		JPanel buttonPanel = new JPanel();
				
		
		JPanel rightPanel = new JPanel();
		rightPanel.add(new JTextArea("메모를 작성해주세요!")); 
		
		//메모장 구성 패널들 위치
//		border.add(leftPanel, BorderLayout.CENTER);
//		border.add(memoListModel, BorderLayout.WEST);
		border.add(buttonPanel, BorderLayout.SOUTH);
		
		tabbedPane.addTab("메모장", border);
		    
		frame.add(tabbedPane); 
		frame.setVisible(true);
	}
	
		private void setButton (JPanel buttonPanel, JButton button, String str)  {
			JButton btname = new JButton(str);
			buttonPanel.add(button);
			
		}

		public static void main(String[] args) {
			
		}

}//class
