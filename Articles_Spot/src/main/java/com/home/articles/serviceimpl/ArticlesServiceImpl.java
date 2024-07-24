package com.home.articles.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.articles.entity.Article;
import com.home.articles.model.ArticleData;
import com.home.articles.repository.ArticlesRepository;
import com.home.articles.service.ArticlesService;

@Service
public class ArticlesServiceImpl implements ArticlesService{
	
	@Autowired
	ArticlesRepository articlesRepository;

	public void addArticles(ArticleData data) {
        Article article=new Article(data.getHeading(),data.getImage(),data.getDescription());
        articlesRepository.save(article);
	}

	@Override
	public List<Article> fetchAllArticles() {
		return articlesRepository.findAll();
		 
	}

	public void deleteArticle(int id) {
		articlesRepository.deleteById(id);
	}

	@Override
	public Article updateArticle(int id, ArticleData data) {
		Optional<Article> optionalArticle = articlesRepository.findById(id);
	    if (optionalArticle.isPresent()) {
	        Article article = optionalArticle.get();
	        // Update the article with data from ArticleData
	        article.setHeading(data.getHeading());
	        article.setDescription(data.getDescription());
	        article.setImage(data.getImage());
	        // Update other fields as needed
	        articlesRepository.save(article);
	        return article;
	    } else {
	        // Handle the case when the article is not found
	        throw new RuntimeException("Article not found with id " + id);
	    }
	}

	@Override
	public Article getArticle(int id) {
		Optional<Article> article=articlesRepository.findById(id);
		if(article.isPresent()) {
			Article article2=article.get();
			return article2;
		} else {
	        // Handle the case when the article is not found
	        throw new RuntimeException("Article not found with id " + id);
	    }
	}

	

	
	
}
