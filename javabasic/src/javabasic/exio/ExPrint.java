package javabasic.exio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ExPrint {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\exprint.dat");
		PrintStream ps = null;
		PrintWriter pw = null;
		
		try {
			ps = new PrintStream(file);
			ps.print("35");
			
			File file2 = new File("D:\\embededk\\files\\exprint2.dat");
			
			pw = new PrintWriter(file2);
			ps.print("kim");
			ps.flush();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		

	} //main

} //class
