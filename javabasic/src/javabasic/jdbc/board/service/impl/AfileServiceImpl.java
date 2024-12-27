package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.AfileDao;
import javabasic.jdbc.board.dao.impl.AfileDaoImpl;
import javabasic.jdbc.board.model.Afile;
import javabasic.jdbc.board.service.AfileService;

public class AfileServiceImpl implements AfileService {
	
	private AfileDao afileDao = new AfileDaoImpl();
	
	public AfileServiceImpl() {
	}

	public List<Afile> listAfile() {
		return afileDao.listAfile();
	}

	public Afile getAfile(int afid) {
		return afileDao.getAfile(afid);
	}

	public int registAfile(Afile afile) {
		return afileDao.registAfile(afile);
	}

	public int modifyAfile(Afile afile) {
		return afileDao.modifyAfile(afile);
	}

	public int removeAfile(int afid) {
		return afileDao.removeAfile(afid);
	}

}
