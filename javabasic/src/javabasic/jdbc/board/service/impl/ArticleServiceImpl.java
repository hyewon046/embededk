package javabasic.jdbc.board.service.impl;

import java.util.List;

import javabasic.jdbc.board.dao.ArticleDao;
import javabasic.jdbc.board.dao.impl.ArticleDaoImpl;
import javabasic.jdbc.board.model.Article;
import javabasic.jdbc.board.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	
	private ArticleDao articleDao = new ArticleDaoImpl();
	
	public ArticleServiceImpl() {
	}

	public List<Article> listArticle() {
		return articleDao.listArticle();
	}

	public Article getArticle(int aid) {
		return articleDao.getArticle(aid);
	}

	public int registArticle(Article article) {
		return articleDao.registArticle(article);
	}

	public int modifyArticle(Article article) {
		return articleDao.modifyArticle(article);
	}

	public int removeArticle(int aid) {
		return articleDao.removeArticle(aid);
	}

}
