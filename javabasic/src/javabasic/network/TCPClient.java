package javabasic.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//TCP Client
public class TCPClient {

	public static void main(String[] args) {
		
		Socket clientSocket = null;
		
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			clientSocket = new Socket("192.168.8.7", 5000);
			//서버에 문자열 송신 스트림
			pw = new PrintWriter(
					new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8")
			);
			
			pw.print("안녕");
			pw.close();
			
			clientSocket = new Socket("192.168.8.7", 5000);
			
			//서버에서 문자열 수신 스트림
			br = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
			System.out.println(br.readLine());
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}//main

}//class
