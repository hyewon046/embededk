package javabasic.project;

import java.util.Scanner;

public class JavaLotto_oop {

	User user;
	UserInput userinput;
    LottoMachine lottomachine;
    RandomProgram randomprogram;

    public JavaLotto_oop() {
    	user = user;
        userinput = userinput;
        lottomachine = lottomachine;
        randomprogram = randomprogram;
    }

    public void start() {
    	
        int[] inputNum = userinput.getInputNumbers();
        int[] randomNum = (int[]) lottomachine.getrandomnum();
        int count = randomprogram.Result(inputNum, randomNum);

      
        System.out.println("구매한 로또 갯수: " + user.Price());
        System.out.println("당첨 번호: " + arrayToString(randomNum));
        System.out.println("입력 번호: " + arrayToString(inputNum));
        System.out.println("맞춘 번호 개수: " + count);
        //등수...
    }

	private String arrayToString(int[] inputNum) {
		return null;
	}




}
