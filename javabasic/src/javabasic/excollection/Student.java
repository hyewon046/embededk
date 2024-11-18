package javabasic.excollection;

public class Student {
	
	String name;

	Score kor;
	Score eng;
	Score math;
	Score sum;
	
	public Student() {
	}
	
	public Student(String name, Score kor, Score eng, Score math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return name + "은 " + "국어 " + kor + "점 " + "수학 " +  math + "점 " 
				+ "영어 " +  eng + "점 " + "총점 " + sum + "점 " ;
	}
	

}
