package javabasic.jdbc.board.main;

import javabasic.jdbc.board.model.Reply;
import javabasic.jdbc.board.service.ReplyService;
import javabasic.jdbc.board.service.impl.ReplyServiceImpl;

public class ReplyMain {

	public static void main(String[] args) {
		
		ReplyService replyService = new ReplyServiceImpl();
		
//		System.out.println(replyService.listReply());
		
//		System.out.println(replyService.getReply(12));
		
//		replyService.registReply(new Reply(0, "대댓글", null, "N", "KANG", 10));
		
//		replyService.modifyReply(new Reply(61, "빠바바바", null, "N", "LEE", 6));
		
		replyService.removeReply(61);

	}

}
