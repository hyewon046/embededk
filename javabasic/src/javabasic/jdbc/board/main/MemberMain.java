package javabasic.jdbc.board.main;

import java.util.List;

import javabasic.jdbc.board.model.Member;
import javabasic.jdbc.board.service.MemberService;
import javabasic.jdbc.board.service.impl.MemberServiceImpl;

public class MemberMain {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberServiceImpl(); //상위타입으로 받기
		// listMember Test
//		System.out.println(memberService.listMember());
		
		// getMember Test
//		System.out.println(memberService.getMember("HONG"));
		
		// registMember Test
//		memberService.registMember(new Member("JANG", "JANG", "장보고", null, null));
		
		// modifyMember Test
		memberService.modifyMember(new Member("HONG", "JANG", "장보고", null,  "N"));
		
		// removeMember Test
//		memberService.removeMember("JANG");
		
		
		
	}//main

}//class
