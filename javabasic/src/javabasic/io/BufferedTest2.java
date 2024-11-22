package javabasic.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest2 {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\buffered2.txt");
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try { 
			bw = new BufferedWriter(new FileWriter(file));
			for (int i =0; i<1000000; i++) {
				bw.write("HELLO JAVA!");
				bw.newLine(); //window : \n. linux: \r\n
			}
			
			br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line=br.readLine()) != null) {
				System.out.println(line);
			}
			//br.readLine(); //줄바꿈나오기전에 한줄 읽어줌
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	} //main

} //class
