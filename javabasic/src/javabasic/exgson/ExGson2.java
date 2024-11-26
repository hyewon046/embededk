package javabasic.exgson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//개인실습 2)
//https://jsonplaceholder.typicode.com/users
//https://jsonplaceholder.typicode.com/todos
//사용자별 todo의 전체개수와 완료한 todo의 개수를 아래 형식으로 todocount.log 파일에 저장
//파일 출력 형식 : 사용자명 [전체todo수:00개, 완료한 todo수:00개]

public class ExGson2 {
	
	public static void main(String[] args) {
		
		String  jsonStr1 = "https://jsonplaceholder.typicode.com/users";
		String  jsonStr2 = "https://jsonplaceholder.typicode.com/todos";
		
		try {
		URL url1 = new URI(jsonStr1).toURL();
		URL url2 = new URI(jsonStr2).toURL();
		
		URLConnection conn1 = url1.openConnection();
		URLConnection conn2 = url2.openConnection();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn1.getOutputStream()));
		String userStr = "";
		String line = "";
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		List <User> userList = gson.fromJson("", List.class);
		List <Todo> todoList = gson.fromJson("", List.class);
		
		File file = new File("D:\\embededk\\files\\todocount.log");
//		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		

		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (URISyntaxException urise) {
			urise.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}//main

}//class
