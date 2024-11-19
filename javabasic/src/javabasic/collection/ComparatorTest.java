package javabasic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		//Comparator타입의 객체 생성
		Comparator<Integer> intCom = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1-i2;
			}
		};
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(10);
		intList.add(2);
		intList.add(9);
		intList.add(5);
		
		//컬렉션 정렬
		Collections.sort(intList, intCom);
		System.out.println(intList);
		
		//컬렉션 뒤집기
		Collections.reverse(intList);
		System.out.println(intList);
		
		Comparator<String> strCom = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
//				//문자열 길이 오름차순 정렬
//				return str1.length() - str2.length();
				//문자열 길이 내림차순 정렬
				return str2.length() - str1.length();
			}
		};
		
		List<String> strList = new ArrayList<String>();
		strList.add("hi");
		strList.add("hello");
		strList.add("java");
		strList.add("programming");
		strList.add("a");
		
		Collections.sort(strList, strCom);
		System.out.println(strList);
		
		class Person {
			String name;
			int age;
			Person(String name, int age) {
				this.name = name;
				this.age = age;
			}
			
			@Override
			public String toString() {
				return name + " : " + age;
			}
		}
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("홍길동", 90));
		personList.add(new Person("강감찬", 10));
		personList.add(new Person("이순신", 30));
		personList.add(new Person("최영", 100));
		personList.add(new Person("권율", 40));

		//1)각 사람의 나이에 대해서 오름차순 정렬하는 Comparator
		Comparator<Person> intCom2 = new Comparator<Person>() {
			@Override
			public int compare(Person p1,Person p2) {
				return p1.age - p2.age;
			}
		};
		Collections.sort(personList, intCom2);
		System.out.println(personList);
		
		//각 사람의 나이에 대해서 내림차순 정렬하는 Comparator
		Comparator<Person> intCom3 = new Comparator<Person>() {
			@Override
			public int compare(Person p1,Person p2) {
				return p2.age - p1.age;
			}
		};
		Collections.sort(personList, intCom3);
		System.out.println(personList);
		
		//2) 아래 리스트를 나이순으로 내림차순 정렬하세요
		List<String> ssnList = new ArrayList<String>();
		ssnList.add("980000-1234567");
		ssnList.add("000000-1234567");
		ssnList.add("050000-1234567");
		ssnList.add("880000-1234567");
		ssnList.add("990000-1234567");
		
		String str = "980000-1234567";
		String year = str.substring(0, 2);
		String fullyear = str.startsWith("0") ? "20"+year : "19" + year;
		Integer.parseInt(fullyear);

		Comparator<String> strCom1 = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String shortyear1 = str1.substring(0, 2); //코드 중복 있으니 메소드로 빼도됨
				String longyear1 = str1.startsWith("0") ? "20"+shortyear1 
						: "19" + shortyear1;
				int intlongyear1 = Integer.parseInt(longyear1);
				String shortyear2 = str2.substring(0, 2);
				String longyear2 = str2.startsWith("0") ? "20"+shortyear2
						: "19" + shortyear2;
				int intlongyear2 = Integer.parseInt(longyear2);
				return intlongyear2 - intlongyear1;
			}
		};
		Collections.sort(ssnList, strCom1);
		System.out.println(ssnList);
		
		
		 // 2) 아래 리스트를 각 학생의 성적 총합 순으로 내림차순 정렬하세요.
	      class Score {
	         int kor; int eng;
	         Score(int kor, int eng) {
	            this.kor = kor; this.eng = eng;
	         }
	      }
	      class Student {
	         String name; Score score; int sum; //여기에 총합을 넣어서 나중에 뺴주기만 하면 편해짐
	         Student(String name, Score score) {
	            this.name = name; 
	            this.score = score;
	            this.sum = this.score.eng + this.score.kor;
	         }
	         
	         @Override
	        public String toString() {
	        	return name + " : " + sum;
	        }
	      }
	      
	      List<Student> stdList = new ArrayList<Student>();
	      stdList.add(new Student("홍길동", new Score(70, 50)));
	      stdList.add(new Student("강감찬", new Score(100, 100)));
	      stdList.add(new Student("이순신", new Score(90, 70)));
	      stdList.add(new Student("장보고", new Score(40, 90)));
	      stdList.add(new Student("최영", new Score(80, 60)));
	      
	      Collections.sort(stdList, new Comparator<Student>() {
	          public int compare(Student s1, Student s2) {
	             return s2.sum - s1.sum;
	          };
	       });
	       System.out.println(stdList);
	       
	       
	       //3) 아래 리스트를 이름순으로 1차 오름차순 정렬하고 가격순으로 내림차순 2차 정렬 //한국어정렬은 어떻게? compareTo이용 /2차정렬은 무엇?
	       /*결과
	        * 마우스 200
	        * 마우스 100
	        * 모니터 200
	        * 모니터 100
	        * ...
	        */
	       class Product {
	    	   String name;
	    	   int price;
	    	   Product(String name, int price) {
	    		   this.name = name;
	    		   this.price = price;
	    	   }
	    	   
	    	   @Override
	    	public String toString() {
	    		return name + ":" + price;
	    	}
	       }

	       List<Product> prodList = new ArrayList<Product>(); 
	       prodList.add(new Product("피씨", 100));
	       prodList.add(new Product("모니터", 100));
	       prodList.add(new Product("마우스", 100));
	       prodList.add(new Product("키보드", 100));
	       prodList.add(new Product("스피커", 100));
	       prodList.add(new Product("피씨", 200));
	       prodList.add(new Product("모니터", 200));
	       prodList.add(new Product("마우스", 200));
	       prodList.add(new Product("키보드", 200));
	       prodList.add(new Product("스피커", 200));
	       
	       Collections.sort(prodList, new Comparator<Product>() {
		    	  public int compare(Product p1, Product p2) {	    		  
		    		  return p1.name.compareTo(p2.name);
		    	  }
		   });
	       
	       Collections.sort(prodList, new Comparator<Product>() {
		    	  public int compare(Product prod1, Product prod2) {	    		  
		    		  if (prod1.name.equals(prod2.name)) {
		   	    	   return prod2.price - prod1.price;
		   	       } else {return 0;}
		    	  }
		   });
	      
	       
	       

	       System.out.println(prodList);

	      
	       
	       
	       
	       

	
	} //main

}//class
