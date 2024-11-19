package javabasic.excollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerMain {

	public static void main(String[] args) {
		
		//플레이어를 4명 만든다
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player("홍길동", Collections.EMPTY_LIST)); //아직 배부된 카드가 없으므로 카드리스트는 empty
		playerList.add(new Player("이순신", Collections.EMPTY_LIST));
		playerList.add(new Player("강감찬", Collections.EMPTY_LIST));
		playerList.add(new Player("권율", Collections.EMPTY_LIST));
		playerList.add(new Player("최영", Collections.EMPTY_LIST));
		
		//카드를 52장 만든다(S2~S14, H2~H14, C2~C14, D2~D14)
		List<Card> totalCardList = new ArrayList<Card>();
		List<String> shapeList = new ArrayList<String>();
		shapeList.add("S");
		shapeList.add("H");
		shapeList.add("C");
		shapeList.add("D");
		for (int i=0; i<shapeList.size(); i++) {
			for (int j = 2; j < 15; j++) {
				totalCardList.add(new Card(j, shapeList.get(i)));
			}
		}
		System.out.println(totalCardList);
		
		//카드 섞기
		Collections.shuffle(totalCardList);
		System.out.println(totalCardList);
		
		//플레이어들에게 7장씩 나눠준다
		//List 인터페이스에 List<E> subList(int~) 메소드
		for (int i=0; i<playerList.size(); i++) {
			playerList.get(i).setCardList(totalCardList.subList(i*7, (i*7)+7)); //player가 카드리스트를 가지고있으니 셋을 함
		}
		for (Player player : playerList) {
			System.out.println(player);
		}
		
		
		
		
	
	}//main

}//class
