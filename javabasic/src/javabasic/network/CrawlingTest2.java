package javabasic.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class CrawlingTest2 {

	public static void main(String[] args) {
		
		URI uri = null;
		URL url = null;
		URLConnection conn = null;
		BufferedReader br = null;
		
		try {
			
			uri = new URI("https://www.ssg.com/page/pc/ranking.ssg");
			url = uri.toURL();
			conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			//한 줄 읽어온 데이터 저장할 변수
			String totalLine = "";
			String line = "";
			//브랜드 시작
			String startStr1 = "<span class=\"chakra-text css-f8xjfi\">";
			//브랜드 끝
			String endStr1 = "</span>";
			//제품명 끝
			String endStr2 = "</p>";
			//가격 시작
			String startStr3 = "<span class=\"css-idkz9h\">판매가격</span>";
			//가격 끝
			String endStr3 = "</em>";
			
			//한줄씩 읽어서 
			while ((line = br.readLine()) != null) {
				totalLine += line;
			}
				
				int startBrandNameIdx = 0;
				int endBrandNameIdx = 0;
				int startBrandNameLeng = startStr1.length();

				int endProductNameIdx = 0;

				int startPriceIdx = 0;
				int endPriceIdx = 0;
				int startPriceLeng = startStr3.length();
				
				//브랜드명
				while ((startBrandNameIdx=totalLine.indexOf(startStr1, startBrandNameIdx+1)) > -1) {
		            endBrandNameIdx = totalLine.indexOf(endStr1, startBrandNameIdx+1);
		            System.out.println(totalLine.substring(startBrandNameIdx + startBrandNameLeng,
		                  endBrandNameIdx));
		         }
				
				//제품명
				while ((endProductNameIdx = totalLine.indexOf(endStr2)) > -1) {
					System.out.println(totalLine.substring(endBrandNameIdx +2, endProductNameIdx));
				}
				
				//가격 
				while((startPriceIdx = totalLine.indexOf(startStr3, startPriceIdx +1)) > -1) {
					endPriceIdx = totalLine.indexOf(endStr3, startPriceIdx+1);
					System.out.println(totalLine.substring(startPriceIdx + startPriceLeng, endPriceIdx ));
				}
					
			

				

				
//				if (line.trim().startsWith(startStr1)) {
//					int startIdx1 = line.indexOf(startStr1)+startStr1.length();
//					int endIdx1 = line.indexOf(endStr1, startIdx1); 
//					brand = line.substring(startIdx1, endIdx1);
//					System.out.println("브랜드명 : " + brand);
//				}
//				if (line.trim().startsWith(startStr2)) {
//					int startIdx2 = line.indexOf(startStr2)+startStr2.length();
//					int endIdx2 = line.indexOf(endStr2, startIdx2);
//					pdname = line.substring(startIdx2, endIdx2);
//					System.out.println("제품명 : " + pdname);
//				}	
//				if (line.trim().startsWith(startStr3)) {
//					int startIdx3 = line.indexOf(startStr3)+startStr3.length();
//					int endIdx3 = line.indexOf(endStr3, startIdx3);
//					price = line.substring(startIdx3, endIdx3);
//					System.out.println("가격 : " + price);
//				}	
				//System.out.println(line);
			
		} catch(URISyntaxException urise) {
			urise.printStackTrace();
		} catch(MalformedURLException mue) {
			mue.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}//main

}//class

