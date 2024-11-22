package javabasic.exio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExBuffered1 {

	public static void main(String[] args) {
		
		
		try {
		BufferedReader br = new BufferedReader (new FileReader("D:\\embededk\\files\\gimi.txt"));
		String str = "";
		str = br.readLine();
		
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\embededk\\files\\gimi.txt"));
		pw.print(str);
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	} //main

} //class
