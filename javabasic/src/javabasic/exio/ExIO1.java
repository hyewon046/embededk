package javabasic.exio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ExIO1 { //내가했지만 애매~

	public static void main(String[] args) {
		File gimi 
		= new File("C:\\Users\\Administrator\\git\\embededk\\javabasic\\src\\javabasic\\exapi1\\gimi.txt");
	
				Reader reader=null;;
			try {
				reader 
				= new FileReader(gimi);
				int i = 0;
				while((i=reader.read()) > -1) { //선생님
					System.out.print((char)i);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			}
		
		

	}

}
