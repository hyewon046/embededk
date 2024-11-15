package javabasic.project;

public class LottoMachine {

    UserInput userInput;

    public LottoMachine(UserInput userInput) {
        this.userInput = userInput;
    }

    public int[] getrandomnum() {
    	int[] randomNum = new int[7];
    	for(int i=0; i<7; i++) {	
			randomNum[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(randomNum[i] == randomNum[j]) {
					i--;;
				}
			} 
    	}
		return randomNum;
    }
} 
