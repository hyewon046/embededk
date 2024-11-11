package javabasic.exoop4;

public class StudentMain {

	public static void main(String[] args) {
		
		makeStudent("김", 80, 70, 60);
		makeStudent("이", 80, 90, 60);
		makeStudent("박", 80, 70, 80);
		
	}
	
	public static void makeStudent(String name, int kscore, int escore, int mscore) {
		Student student = new Student(name);
		student.score = student.new Score(kscore, escore, mscore, 0, 0.0f);
		printScore(student);
		
	}
	
	public static void printScore(Student student) {
			System.out.println("이름 : " + student.name);
			System.out.println("국어점수 : " + student.score.kscore);
			System.out.println("영어점수 : " + student.score.escore);
			System.out.println("수학점수 : " + student.score.mscore);
			System.out.println("총점 : " + student.score.getTotal());
			System.out.println("평균 : " + student.score.getAvg());
			
	}
	
	
}
