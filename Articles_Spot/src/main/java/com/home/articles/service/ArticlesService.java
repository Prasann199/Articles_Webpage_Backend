package com.home.articles.service;

import java.util.List;

import com.home.articles.entity.Article;
import com.home.articles.model.ArticleData;

public interface ArticlesService {

	public List<Article> fetchAllArticles();
	public void addArticles(ArticleData data);
	public void deleteArticle(int id);
	public Article updateArticle(int id, ArticleData data);
	public Article getArticle(int id);
	
	

}
