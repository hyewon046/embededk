package javabasic.exoop4;

public class Student { //*Student가 이름과 Score를 가진다. (has a)
	String name;
	Score score;
	
	public Student(String name, Score score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Student(String name) {
	}

	class Score{
		
		int kscore;
		int mscore;
		int escore;
		int total;
		float avg;
		
		public Score(int kscore, int mscore, int escore, int total, float avg) {
			super();
			this.kscore = kscore;
			this.mscore = mscore;
			this.escore = escore;
			this.total = total;
			this.avg = avg;
		}
		
		public int getTotal() {
			return kscore + mscore + escore;
		}
		
		public int getAvg() {
			return getTotal()/3;
		}
	}
			
} //class
