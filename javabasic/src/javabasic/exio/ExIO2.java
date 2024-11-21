package javabasic.exio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ExIO2 { //나

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Writer writer =null;

		try {
			
			File file = new File("D:\\embededk\\files\\" + sc.next() + ".txt");
			writer = new FileWriter(file);
			writer.write(sc.next());
			writer.flush();
		
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
