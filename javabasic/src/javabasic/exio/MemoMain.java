package javabasic.exio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MemoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력해주세요! (1.메모리스트 2. 메모입력 3. 메모삭제 4. 종료)");
		
		File file = new File("D:\\embededk\\files\\memo.dat");
		ObjectOutputStream ois = null;
		 
		try {
			ois = new ObjectOutputStream(new FileOutputStream(file));
			String str = sc.next();
			ois.writeUTF(str);
			
			
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	} //main

} //class
