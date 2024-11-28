package javabasic.exgui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class ExMemopad1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("메모장");
						
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		frame.setSize(600, 400); 
						
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel border = new JPanel(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(new JButton("메모 등록"));
		buttonPanel.add(new JButton("메모 수정"));
		buttonPanel.add(new JButton("메모 삭제"));
		border.add(buttonPanel, BorderLayout.SOUTH);
		
		JPanel leftPanel = new JPanel();
		border.add(leftPanel, BorderLayout.WEST);
		String[] memoList = {"메모 1", "메모 2"};
		leftPanel.add(new JList<String> (memoList));
				
		
		JPanel rightPanel = new JPanel();
		border.add(leftPanel, BorderLayout.CENTER);
		rightPanel.add(new JTextArea("메모를 작성해주세요!")); 
		
		
		
		tabbedPane.addTab("메모장", border);
		    
		frame.add(tabbedPane); 
		frame.setVisible(true);
		
		
		
		
		
		
		
		

	}//main

}//class
