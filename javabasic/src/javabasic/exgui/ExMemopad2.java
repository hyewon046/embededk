package javabasic.exgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * 간단한 메모장 프로그램
 * - 메모 등록, 수정, 삭제 기능 포함
 * - Java GUI 실습용
 */
public class ExMemopad2 extends JFrame {
    // 메모 데이터를 저장하는 리스트 /추가) 리스트타입?을 Memo로 바꿔보기(메모 등록 수정 선택된 영역 텍스트 표시 부분이 바뀜)
    private DefaultListModel<Memo> memoListModel;
    private JList<Memo> memoList;
    private JTextArea memoTextArea;
    private JTextField tfSubject;
    private File file;

    public ExMemopad2() {
        // 프레임 설정
        setTitle("메모장 프로그램");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 좌측: 메모 목록 패널
        memoListModel = new DefaultListModel<Memo>();
        memoList = new JList<Memo>(memoListModel);
        memoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        memoList.setPreferredSize(new Dimension(250,600));
        memoList.setBackground(Color.LIGHT_GRAY); //배경색 지정
        memoList.setFont(new Font("맑은 고딕", Font.ITALIC, 30));
        JScrollPane listScrollPane = new JScrollPane(memoList);
        

        // 우측: 메모 내용 패널
        JPanel mainPanel = new JPanel(new BorderLayout());
        tfSubject = new  JTextField("제목 입력");
        memoTextArea = new JTextArea("내용 입력");
        JScrollPane textScrollPane = new JScrollPane(memoTextArea);
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
        saveMenuItem.setEnabled(false); //새파일 생성후 저장을 위해 일단 실행 정지
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
        
        //추가) 새파일 누르면 옵션창 뜨게 추가)새 메모를 누르면 파일을 새로 열기?
        newFileMenuItem.addActionListener(e -> {
        	String newFileName = JOptionPane.showInputDialog(jframe, "파일명(.json)을 입력해주세요!", "새 파일", 
        			JOptionPane.INFORMATION_MESSAGE);
        	if(newFileName != null && !newFileName.trim().isEmpty()) {
        		file = new File("D:\\embededk\\files\\" + newFileName);
        		try {
        		file.createNewFile();
        		} catch (IOException ioe) {
        			ioe.printStackTrace();
        		}
        		saveMenuItem.setEnabled(true);
        		tfSubject.setText("");
                memoTextArea.setText("");
        	}
        });

        //추가) 열기 누르면 파일 찾아오기//추추가) 파일 불러오기 but 불러올때 파일명을 바꿔야함
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("json", "json");
        chooser.setFileFilter(filter);
        openMenuItem.addActionListener(e -> {
//        	chooser.showOpenDialog(chooser);
        	int returnVal = chooser.showOpenDialog(jframe);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
               file = new File("D:\\embededk\\files\\" +chooser.getSelectedFile().getName());
               BufferedReader br = null;
               try {
            	   br = new BufferedReader(new FileReader(file));
            	   String jsonStr = "";
            	   String line = "";
            	   while((line=br.readLine())!=null) {
            		   jsonStr += line;
            	   }
            	   Gson gson = new GsonBuilder().create();
            	   memoListModel = new DefaultListModel<Memo>();
            	   memoListModel.addAll(
            			   gson.fromJson(
            					   jsonStr, new TypeToken<List<Memo>>() {}.getType()
            				)
            		);
            	   memoList.setModel(memoListModel);
               } catch (FileNotFoundException fnfe) {
               	fnfe.printStackTrace();
               } catch (IOException ioe) {
               	ioe.printStackTrace();
               }
            
            }
            
        });
        
        //추가) 저장 누르면 저장완료 메세지 띄우기 추가)json파일로 저장
        saveMenuItem.addActionListener(e -> {
        	Object[] memoArr = memoListModel.toArray();
        	Gson gson = new GsonBuilder().create();
        	PrintWriter pw = null;
        	try {
        	pw=new PrintWriter(new FileWriter(file), true);
        	pw.print(gson.toJson(memoArr));
        	pw.flush();
        	} catch (IOException ioe) {
        		ioe.printStackTrace();
        	}
        	JOptionPane.showMessageDialog(jframe, "저장 완료!", "저장하기", JOptionPane.INFORMATION_MESSAGE);
			        
        });
        
      //상단에 이미지 넣기
      		JPanel jNorthPanel = new JPanel(new BorderLayout());
      		ImageIcon logo = new ImageIcon("D:\\embededk\\files\\logo.png");
      		JLabel imageLabel = new JLabel();
      		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
      		imageLabel.setIcon(logo);
      		jNorthPanel.add(imageLabel, BorderLayout.NORTH);
      		jNorthPanel.add(menubar, BorderLayout.SOUTH);
       
        // 프레임에 구성요소 추가
        add(listScrollPane, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(jNorthPanel, BorderLayout.NORTH);

        setVisible(true);
        
        //프로그램 시작시에 새 파일
        this.addWindowListener(new WindowAdapter() {
        	public void windowOpened(java.awt.event.WindowEvent e) {
        		newFileMenuItem.doClick(); //클릭 이벤트 강제발생(윈도우가 열리자마자 새파일을 누르게 함)
        	}
        });
   
    } //constructor
    
    // 패널에 버튼 추가
    private void addButtons(JPanel jpanel, JButton... child) { //var agrs 이용
       for (JButton jbutton : child) {
          jpanel.add(jbutton);
       }
    }

    // 메모 등록 메서드
    private void addMemo() {
    	 Memo newMemo 
         = new Memo(memoListModel.getSize(), 
               tfSubject.getText().trim(), memoTextArea.getText().trim());
       if (!tfSubject.getText().isEmpty()
             && !memoTextArea.getText().isEmpty()) {
           memoListModel.addElement(newMemo);
           tfSubject.setText("");
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
           Memo updatedMemo = new Memo(
                 memoList.getSelectedIndex(),
                 tfSubject.getText().trim(),
                 memoTextArea.getText().trim()
           );
            if (!tfSubject.getText().isEmpty()
                  && !memoTextArea.getText().isEmpty()) {
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
            tfSubject.setText("");
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
           tfSubject.setText(memoListModel.get(selectedIndex).getSubject());
            memoTextArea.setText(memoListModel.get(selectedIndex).getContent());
        }
    }
    
    
    public static void main(String[] args) {
        // 프로그램 실행
        SwingUtilities.invokeLater(ExMemopad2::new);
    }
}

