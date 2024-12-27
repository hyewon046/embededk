package javabasic.jdbc.board.service.impl;

import java.util.List;
import java.util.Map;

import javabasic.jdbc.board.dao.MemberDao;
import javabasic.jdbc.board.dao.impl.MemberDaoImpl;
import javabasic.jdbc.board.dao.impl.MemberFileDaoImpl;
import javabasic.jdbc.board.model.Member;
import javabasic.jdbc.board.service.MemberService;

public class MemberFileServiceImpl implements MemberService {
	
	private MemberDao memberDao = new MemberFileDaoImpl();
	
	public MemberFileServiceImpl() {
	}

	public List<Member> listMember() {
		return memberDao.listMember();
	}

	public Member getMember(String mid) {
		return memberDao.getMember(mid);
	}

	public int registMember(Member member) {
		return memberDao.registMember(member);
	}

	public int modifyMember(Member member) {
		return memberDao.modifyMember(member);
	}

	public int removeMember(String mid) {
		return memberDao.removeMember(mid);
	}

}

//오버라이드 글씨 오류나서 없애버림
