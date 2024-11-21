package javabasic.exio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ExIO3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File file = new File("D:\\embededk\\files\\student.dat");
		OutputStream os = null;
		InputStream is = null;
		
		try {
			os = new FileOutputStream(file);
//			os.write(sc.next());
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
