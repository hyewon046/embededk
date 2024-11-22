package javabasic.exio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExBuffered2 {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\말티즈.jpg");
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {
			 bis = new BufferedInputStream(new FileInputStream(file));
			 bos = new BufferedOutputStream(new FileOutputStream("D:\\embededk\\files\\말티즈__copy.jpg"));
			 
			 byte[] byteArr = new byte[1024*1024];
			 bos.write(byteArr);
			 bis.read(byteArr);
			 
			 int readByte = 0;
				while ((readByte = bis.read(byteArr)) >-1) {
					bos.write(byteArr, 0, readByte);
				}
			 
			bos = new BufferedOutputStream(new FileOutputStream("D:\\embededk\\files\\말티즈__copy.jpg"));
			 bos.flush();
 
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
				

	} //main

} //class
