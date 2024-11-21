package javabasic.exio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ExConvBufferStream {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		File file = new File("D:\\embededk\\files\\scanner1.txt"); 
		Writer writer = null;
		Reader reader = null;
		BufferedReader br = null;
		
		try {
			writer = new FileWriter(file);
			writer.write(str);
			writer.flush();
			
			reader = new FileReader(file);
//			reader.read();
//			System.out.println((char)reader.read());
			br = new BufferedReader(new FileReader(file));
			System.out.println(br.readLine());
			
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		

	} //main

} //class
