package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.BoardDao;
import javabasic.jdbc.board.dao.impl.BoardDaoImpl;
import javabasic.jdbc.board.model.Board;
import javabasic.jdbc.board.service.BoardService;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao = new BoardDaoImpl();

	public List<Board> listBoard() {
		return boardDao.listBoard();
	}

	public Board getBoard(int bid) {
		return boardDao.getBoard(bid);
	}

	public int registBoard(Board board) {
		return boardDao.registBoard(board);
	}

	public int modifyBoard(Board board) {
		return boardDao.modifyBoard(board);
	}

	public int removeBoard(int bid) {
		return boardDao.removeBoard(bid);
	}

}
