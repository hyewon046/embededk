package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.ReplyDao;
import javabasic.jdbc.board.dao.impl.ReplyDaoImpl;
import javabasic.jdbc.board.model.Reply;
import javabasic.jdbc.board.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {
	
	private ReplyDao replyDao = new ReplyDaoImpl();
	
	public ReplyServiceImpl() {
	}

	public List<Reply> listReply() {
		return replyDao.listReply();
	}

	public Reply getReply(int rid) {
		return replyDao.getReply(rid);
	}

	public int registReply(Reply reply) {
		return replyDao.registReply(reply);
	}

	public int modifyReply(Reply reply) {
		return replyDao.modifyReply(reply);
	}

	public int removeReply(int rid) {
		return replyDao.removeReply(rid);
	}

}
