package javabasic.api;

public class StringTest {
	
	public static void main(String[] args) {
		
		String str1 = "abcdefgh";
		
		System.out.println(str1.charAt(3));
		System.out.println(str1.concat("ij"));
		System.out.println(str1 +"ij");
		System.out.println(str1.contains("cba"));
		System.out.println(str1.endsWith("gh"));
		System.out.println(str1.equals("abcdefgh"));
		System.out.println(str1.equalsIgnoreCase("AbcdeFgh"));
		System.out.println(str1.getBytes());//앞에 [B 는 배열이라는 뜻
		byte[] byteArr = str1.getBytes();
		for (byte b : byteArr) {
			System.out.println((char)b); //b만 적으면 아스키코드, char적으면 문자로
		}
		System.out.println(str1.indexOf('c'));
		
		String str2 = "      ";
		
		System.out.println(str2.isBlank());
		System.out.println(str2.isEmpty());
		
		String str3 = "abcdabcdabcd";
		
		System.out.println(str3.lastIndexOf('a'));
		System.out.println(str3.length());
		System.out.println(str3.repeat(2));
		System.out.println(str3.replace("bc", "ef"));
		System.out.println(str3.replaceAll("ab", "12"));
		
		String[] strArr = str3.split("c");
		for (String str : strArr) {
			System.out.println(str);
		}
		
		String str4 = "010-1234-5678";
		
		String[] strArr1 = str4.split("-");
		for (String str : strArr1) {
			System.out.print(str);
		}
		System.out.println();
		
		String str5 = "안녕하세요! 자바 재밌나요";
		
		System.out.println(str5.startsWith("안녕"));
		System.out.println(str5.substring(7));
		System.out.println(str5.substring(7, 9));
		
		char[] charArr = str5.toCharArray();
		for (char ch : charArr) {
			System.out.println(ch);
		}
		
		String str6 = " AbC dEf ";
		
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		System.out.println(str6.trim());
		
		System.out.println(String.valueOf(false)); //아래와 같은 결과값
		System.out.println("" + false); //noun string에 붙이면 문자열이 됨
		System.out.println(String.valueOf(100));
		System.out.println("" + 100);
		System.out.println(String.valueOf(new Object()));
		System.out.println("" + new Object());
		
	}// main

} //class
