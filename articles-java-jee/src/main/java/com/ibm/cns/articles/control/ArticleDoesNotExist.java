package com.ibm.cns.articles.control;

public class ArticleDoesNotExist extends Exception {

	private static final long serialVersionUID = 1L;

	public ArticleDoesNotExist() {
	}

	public ArticleDoesNotExist(String message) {
		super(message);
	}
}