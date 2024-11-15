package javabasic.project;

public class RandomProgram {
	
	 public int Result(int[] inputNum, int[] randomNum) {
	        int count = 0;

	        for (int userNumber : inputNum) {
	            if (UserInput.Duplicate(randomNum, userNumber)) {
	                count++;
	            }
	        }
	        return count;
	    }

}
