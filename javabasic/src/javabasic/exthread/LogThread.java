package javabasic.exthread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogThread extends Thread{
	
	BufferedReader br = null;
	Writer writer = null;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		Date now = new Date(); 
		SimpleDateFormat sdf 
			= new SimpleDateFormat("[yyyy/MM/dd/aHH:mm:ss]");
		File file = new File("D:\\embededk\\files\\inputstring.log");
		
		while(true) {
			try {
				writer = new FileWriter(file, true);
				writer.write(sdf.format(now) +" " + sc.next() + "\n");
				writer.flush();
			
				br = new BufferedReader(new FileReader(file));
				System.out.println(br.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				writer.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	}//run
}//class
