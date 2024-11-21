package javabasic.exio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ExIO1 { //내가했지만 애매~

	public static void main(String[] args) {
		File gimi 
		= new File("C:\\Users\\Administrator\\git\\embededk\\javabasic\\src\\javabasic\\exapi1\\gimi.txt");
	
//				Reader reader 
//				= new FileReader(gimi);
			try {
				BufferedReader br = new BufferedReader(new FileReader(gimi));
				System.out.println(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			}
		
		

	}

}
