package javabasic.jdbc.board.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javabasic.jdbc.board.dao.MemberDao;
import javabasic.jdbc.board.model.Member;

public class MemberFileDaoImpl implements MemberDao {

	File file;
	BufferedReader br;
	BufferedWriter bw;
	Gson gson;

	private static Map<String, Member> memberMap 
		= new HashMap<String, Member>(); // memberfiledaoimpl이 map을 가지고있음 (has a 관계)

	public MemberFileDaoImpl() {
		file = new File("D:/embededk/files/member.json");
		gson = new GsonBuilder().setPrettyPrinting().create();
		memberMap = getMemberMap(); //시작할때 파일에 있는 정보를 맵에 가져옴
	}

	public List<Member> listMember() {
		Set<String> keySet = getMemberMap().keySet();
		Iterator<String> it = keySet.iterator();
		List<Member> memberList = new ArrayList<Member>();
		while (it.hasNext()) {
			memberList.add((Member) memberMap.get(it.next()));
		}
		return memberList;
	}
	/*
	 * 파일을 사용하지 않았음 Set<String> keySet = memberMap.keySet(); Iterator<String> it =
	 * keySet.iterator(); List<Member> memberList = new ArrayList<Member>();
	 * while(it.hasNext()) { memberList.add((Member)memberMap.get(it.next())); }
	 * return memberList;
	 */

	public Member getMember(String mid) {
		return (Member) getMemberMap().get(mid);
	}

	public int registMember(Member member) {
		memberMap.put(member.getMid(), member);
		String jsonStr = gson.toJson(memberMap);
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(jsonStr);
			bw.flush();
			return 1;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return 0;
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	public int modifyMember(Member member) {
		memberMap.remove(member.getMid());
		//memberMap.put(member.getMid(), member);
		registMember(member);
		setMemberMap();
		return 1;
	}

	public int removeMember(String mid) {
		memberMap.remove(mid);
		setMemberMap();
		return 1;		
	}

	private Map<String, Member> getMemberMap() {
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			String jsonStr = "";
			while ((line = br.readLine()) != null) {
				jsonStr += line;
			}
			return gson.fromJson(jsonStr, new TypeToken<Map<String, Member>>() {
			}.getType()); // Gson 참고 
			// 원래는 Map<String, Member> memberMap = gson.fromJson(jsonStr, 
			//					new TypeToken<Map<String, Member>>() {}.getType());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	private void setMemberMap() { // 파일 갱신
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(gson.toJson(memberMap));
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null) bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
} // class