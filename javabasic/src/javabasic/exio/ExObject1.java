package javabasic.exio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExObject1 {

	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\exobject.dat");
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		Person kim = new Person("김군", 25);
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(kim);
			System.out.println(kim.name + ", " + kim.age);
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Person k = (Person)ois.readObject();
			System.out.println(k.name + ", " + k.age);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}

		
		

	} //main

} //class
