package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectTest2 {

	public static void main(String[] args) {

		File file = new File("D:\\embededk\\files\\object2.dat");
		
		class Score implements Serializable {
			private static final long serialVersionUID = 2034572234L;
			int kor;
			int eng;
			Score(int kor, int eng) {
				this.kor = kor;
				this.eng = eng;
			}
		}
		
		class Person implements Serializable {
			private static final long serialVersionUID = 93485234892L;
			String name;
			transient String ssn; //주민번호, transient : 직렬화 제외 키워드
			int age;
			Score score;
			
			public Person(String name, String ssn, int age, Score score) {
				this.name = name;
				this.ssn = ssn;
				this.age = age;
				this.score = score;
			}
		}
		
		Person hong = new Person("홍길동", "000000-1234567", 20, new Score(100,80));
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(hong); //직렬화
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Person h =(Person)ois.readObject(); //역직렬화
			
			System.out.println(h.name);
			System.out.println(h.ssn); //transient 키워드가 붙으면 타입의 기본값으로 직렬화-값을 보내긴하는데 기본값으로 보내서 알 수 없어짐 
												 //원래 직렬화 - 값을 초기화해서 직렬화
			System.out.println(h.age);
			System.out.println(h.score.kor);
			System.out.println(h.score.eng);
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
		
	} //main

} //class
