package javabasic.exio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExObject2 {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\exobject2.dat");
		
		ObjectOutputStream oos = null; 
		ObjectInputStream ois = null;
		List <String> snack = new ArrayList<String>();
		snack.add("계란과자");
		snack.add("포카칩");
		snack.add("꼬북칩");
		
		Shop shop = new Shop("편의점", snack);
		
		try {
			oos = new  ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(shop);
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Shop shop2 = (Shop)ois.readObject();
			System.out.println(shop2);
			
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}

	} //main

} //class
