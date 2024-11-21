package javabasic.exio;

import java.io.File;

public class ExFileTree {

	public static void main(String[] args) { //재귀함수 사용, 선생님
		
		printFileTree(new File("C:\\"));

	} //main
	
	private static void printFileTree(File file) {
		File[] files = file.listFiles();
		if (files != null) {
			for(File f : files) {
				if(f.isDirectory()) {
					System.out.println("[" + f.getName() + "]"); //디렉토리
					printFileTree(f);
				}else if(f.isFile()) {
					System.out.println("\t" + f.getName() + "(" + f.length() + ")"); //파일
			
				}
			}
		}
	}

} //class
