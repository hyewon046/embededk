package javabasic.jdbc.board.main;

import javabasic.jdbc.board.model.Board;
import javabasic.jdbc.board.service.BoardService;
import javabasic.jdbc.board.service.impl.BoardServiceImpl;

public class BoardMain {
	
	public static void main(String[] args) {
		
		BoardService boardService = new BoardServiceImpl();
		
		// listBoard
//		System.out.println(boardService.listBoard());
		
		// getBoard
//		System.out.println(boardService.getBoard(2));
		
		// registBoard
//		boardService.registBoard(new Board(0, "비밀게시판", null, null));
		
		// modifyBoard
//		boardService.modifyBoard(new Board(21, "상담게시판", null, "Y"));
		
		// removeBoard
		boardService.removeBoard(21);
		
		
		
		
		
		
		
	}//main

}//class
