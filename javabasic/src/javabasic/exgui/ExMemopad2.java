package javabasic.exgui;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
/**
 * 간단한 메모장 프로그램
 * - 메모 등록, 수정, 삭제 기능 포함
 * - Java GUI 실습용
 */
public class ExMemopad2 extends JFrame {
    // 메모 데이터를 저장하는 리스트
    private final DefaultListModel<Memo> memoListModel;
    private final JList<Memo> memoList;
    private final JTextArea memoTextArea;

    public ExMemopad2() {
        // 프레임 설정
        setTitle("메모장 프로그램");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 좌측: 메모 목록 패널
        memoListModel = new DefaultListModel<>();
        memoList = new JList<>(memoListModel);
        memoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(memoList);
        

        // 우측: 메모 내용 패널
        JPanel mainPanel = new JPanel();
        memoTextArea = new JTextArea("내용 입력");
        JScrollPane textScrollPane = new JScrollPane(memoTextArea);
        JTextField tfSubject = new  JTextField("제목 입력");
        mainPanel.add(tfSubject, BorderLayout.NORTH);
        mainPanel.add(textScrollPane, BorderLayout.CENTER);
        

        // 하단: 버튼 패널
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("메모 등록");
        JButton editButton = new JButton("메모 수정");
        JButton deleteButton = new JButton("메모 삭제");

        addButtons(buttonPanel, addButton, editButton, deleteButton);

        // 이벤트 처리
        addActionListener(addButton, editButton, deleteButton);

        memoList.addListSelectionListener(e -> displaySelectedMemo());
        
        //추가) 파일메뉴 만들기
        JMenuBar menubar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenuItem newFileMenuItem = new JMenuItem("새메모");
        JMenuItem openMenuItem = new JMenuItem("열기");
        JMenuItem saveMenuItem = new JMenuItem("저장");
        
        fileMenu.add(newFileMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        menubar.add(fileMenu);
        
        //추가)정보메뉴 만들기
        JMenu infoMenu = new JMenu("정보");
        menubar.add(infoMenu);
        
        //추가) 정보창 누르면 옵션창 뜨게
        JFrame jframe = this;
        infoMenu.addMenuListener(new MenuListener() { //메소드 3개를 전부 오버라이딩해야함
        	public void menuSelected(MenuEvent e) {
        		JLabel message = new JLabel("Copyright 2024 kim");
        		message.setHorizontalAlignment(SwingConstants.CENTER); //텍스트창에서 센터로 정렬하기
        		JOptionPane.showMessageDialog(jframe, message);
        	}
        	public void menuDeselected(MenuEvent e) {};
        	public void menuCanceled(MenuEvent e) {};
        });
        
        //추가) 새파일 누르면 옵션창 뜨게
        newFileMenuItem.addActionListener(e -> {
        	JOptionPane.showInputDialog(jframe, "파일명을 입력해주세요!", "새 파일", 
        			JOptionPane.INFORMATION_MESSAGE);
        });

        //추가) 열기 누르면 파일 찾아오기
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("json", "json");
        chooser.setFileFilter(filter);
        openMenuItem.addActionListener(e -> {
//        	chooser.showOpenDialog(chooser);
        	int returnVal = chooser.showOpenDialog(jframe);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
               System.out.println(chooser.getSelectedFile().getName());}
        });
        
        //추가) 저장 누르면 저장완료 메세지 띄우기
        saveMenuItem.addActionListener(e -> {
        	JOptionPane.showMessageDialog(jframe, "저장 완료!", "저장하기", JOptionPane.INFORMATION_MESSAGE);
        });
       
        // 프레임에 구성요소 추가
        add(listScrollPane, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(menubar, BorderLayout.NORTH);

        setVisible(true);
    }
    
    // 패널에 버튼 추가
    private void addButtons(JPanel jpanel, JButton... child) { //var agrs 이용
       for (JButton jbutton : child) {
          jpanel.add(jbutton);
       }
    }

    // 메모 등록 메서드
    private void addMemo() {
        String newMemo = memoTextArea.getText().trim();
        if (!newMemo.isEmpty()) {
            memoListModel.addElement(newMemo);
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 등록되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "메모 내용을 입력하세요.");
        }
    }

    // 메모 수정 메서드
    private void editMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            String updatedMemo = memoTextArea.getText().trim();
            if (!updatedMemo.isEmpty()) {
                memoListModel.set(selectedIndex, updatedMemo);
                JOptionPane.showMessageDialog(this, "메모가 수정되었습니다.");
            } else {
                JOptionPane.showMessageDialog(this, "메모 내용을 입력하세요.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "수정할 메모를 선택하세요.");
        }
    }

    // 메모 삭제 메서드
    private void deleteMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            memoListModel.remove(selectedIndex);
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 삭제되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "삭제할 메모를 선택하세요.");
        }
    }
    
    // 리스너 등록
    // e : 발생한 이벤트객체
    // e.getSoutce() : 이벤트를 발생시킨 객체 = 이벤트 타겟 객체 = 이벤트 소스 객체
    // 버튼에 쓰여있는 글자에 따라 다른 메소드를 호출
    private void addActionListener(JButton... jbuttons) {
    	for (JButton jbutton : jbuttons) {
	       jbutton.addActionListener(e -> {
	          switch (((JButton)e.getSource()).getText()) {
	             case "메모 등록" : addMemo(); break;  
	             case "메모 수정" : editMemo(); break;  
	             case "메모 삭제" :  deleteMemo();
	          }
	       });
	    }
    }

    // 선택된 메모를 텍스트 영역에 표시
    private void displaySelectedMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            memoTextArea.setText(memoListModel.get(selectedIndex));
        }
    }

    public static void main(String[] args) {
        // 프로그램 실행
        SwingUtilities.invokeLater(ExMemopad1::new);
    }
}

