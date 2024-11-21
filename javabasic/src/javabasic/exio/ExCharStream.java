package javabasic.exio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;;

public class ExCharStream {

	public static void main(String[] args) {
		
		Writer writer = null;
		Reader reader = null;
		
		File file = new File("D:\\embededk\\files\\name.txt");
		try {
			writer = new FileWriter(file);
			writer.write("박혜원");
			writer.flush();
			
			reader = new FileReader(file);
			//System.out.println(String.valueOf((char)reader.read()));
			BufferedReader br = new BufferedReader(new FileReader(file)); //버퍼를 안쓰고 할 수 있는 방법이 있을까.,,..
			System.out.println(br.readLine());
			
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
			reader.close();
			writer.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

 		
				

	}

}
