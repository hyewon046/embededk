package javabasic.exio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExData {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\exdata.dat");
		
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			
			dos = new DataOutputStream(new FileOutputStream(file));
			dos.writeUTF("홍길동");
			dos.write(20);
			dos.writeUTF("010");
			dos.writeChar('-');
			dos.writeUTF("1234");
			dos.writeChar('-');
			dos.writeUTF("5678");
			
			dis = new DataInputStream (new FileInputStream(file));
			System.out.println(dis.readUTF());
			System.out.println(dis.read());
			System.out.print(dis.readUTF());
			System.out.print(dis.readChar());
			System.out.print(dis.readUTF());
			System.out.print(dis.readChar());
			System.out.print(dis.readUTF());
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			
		}

	}//main

}//class